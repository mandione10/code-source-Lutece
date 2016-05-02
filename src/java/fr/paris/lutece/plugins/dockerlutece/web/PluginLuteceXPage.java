/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.dockerlutece.web;
 
import fr.paris.lutece.plugins.dockerlutece.business.DomainePluginLutece;
import fr.paris.lutece.plugins.dockerlutece.business.DomainePluginLuteceHome;
import fr.paris.lutece.plugins.dockerlutece.business.PluginLutece;
import fr.paris.lutece.plugins.dockerlutece.business.PluginLuteceHome;
import fr.paris.lutece.portal.util.mvc.commons.annotations.Action;
import fr.paris.lutece.portal.web.xpages.XPage;
import fr.paris.lutece.portal.util.mvc.xpage.MVCApplication;
import fr.paris.lutece.portal.util.mvc.commons.annotations.View;
import fr.paris.lutece.portal.util.mvc.xpage.annotations.Controller;
import fr.paris.lutece.util.url.UrlItem;
import java.util.Map;
import fr.paris.lutece.portal.service.message.SiteMessageService;
import fr.paris.lutece.portal.service.message.SiteMessage;
import fr.paris.lutece.portal.service.message.SiteMessageException;
import fr.paris.lutece.portal.web.LocalVariables;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

/**
 * This class provides the user interface to manage PluginLutece xpages ( manage, create, modify, remove )
 */
 
@Controller( xpageName = "pluginlutece" , pageTitleI18nKey = "dockerlutece.xpage.pluginlutece.pageTitle" , pagePathI18nKey = "dockerlutece.xpage.pluginlutece.pagePathLabel" )
public class PluginLuteceXPage extends MVCApplication
{
    // Templates
    private static final String TEMPLATE_MANAGE_PLUGINLUTECES="/skin/plugins/dockerlutece/manage_pluginluteces.html";
    private static final String TEMPLATE_CREATE_PLUGINLUTECE="/skin/plugins/dockerlutece/create_pluginlutece.html";
    private static final String TEMPLATE_MODIFY_PLUGINLUTECE="/skin/plugins/dockerlutece/modify_pluginlutece.html";
    private static final String TEMPLATE_FORM_PLUGINLUTECE="/skin/plugins/dockerlutece/formulaire.html";
    private static final String TEMPLATE_FORM_GENERATE_PLUGINLUTECE="/skin/plugins/dockerlutece/formulaire_generate.html";
    
    // JSP
    private static final String JSP_PAGE_PORTAL = "jsp/site/Portal.jsp";
    
    // Parameters
    private static final String PARAMETER_ID_PLUGINLUTECE="id";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_PAGE = "page";
    
    // Markers
    private static final String MARK_PLUGINLUTECE_LIST = "pluginlutece_list";
    private static final String MARK_PLUGINLUTECE = "pluginlutece";
    
    private static final String MARK_DOMAINE_LIST_PLUGINS = "domaineplugins_list";
    private static final String MARK_VERSION_LIST_PLUGINS = "versionsplugins_list";
    
    // Message
    private static final String MESSAGE_CONFIRM_REMOVE_PLUGINLUTECE = "dockerlutece.message.confirmRemovePluginLutece";
    
    // Views
    private static final String VIEW_MANAGE_PLUGINLUTECES = "managePluginLuteces";
    private static final String VIEW_CREATE_PLUGINLUTECE = "createPluginLutece";
    private static final String VIEW_MODIFY_PLUGINLUTECE = "modifyPluginLutece";
    private static final String VIEW_FORM_PLUGINLUTECE = "form";
    private static final String VIEW_FORM_GENERATE_PLUGINLUTECE = "form_generate";

    // Actions
    private static final String ACTION_CREATE_PLUGINLUTECE = "createPluginLutece";
    private static final String ACTION_MODIFY_PLUGINLUTECE= "modifyPluginLutece";
    private static final String ACTION_REMOVE_PLUGINLUTECE = "removePluginLutece";
    private static final String ACTION_CONFIRM_REMOVE_PLUGINLUTECE = "confirmRemovePluginLutece";
    private static final String ACTION_GENERATE_POM_PLUGINLUTECE = "generatePom";
    private static final String ACTION_DOWNLOAD_PLUGINLUTECE = "downloadPluginLutece";
    

    // Infos
    private static final String INFO_PLUGINLUTECE_CREATED = "dockerlutece.info.pluginlutece.created";
    private static final String INFO_PLUGINLUTECE_UPDATED = "dockerlutece.info.pluginlutece.updated";
    private static final String INFO_PLUGINLUTECE_REMOVED = "dockerlutece.info.pluginlutece.removed";
    
    // Session variable to store working values
    private PluginLutece _pluginlutece;
    private static final int TAILLE_TAMPON = 10240; //10 ko
    private static final String ZIP_EXTENSION = ".zip";
    private String plugins_list[] = null;
    
    @View( value = VIEW_MANAGE_PLUGINLUTECES, defaultView = true )
    public XPage getManagePluginLuteces( HttpServletRequest request )
    {
        _pluginlutece = null;
        Map<String, Object> model = getModel(  );
        model.put( MARK_PLUGINLUTECE_LIST, PluginLuteceHome.getPluginLutecesList(  ) );

        return getXPage( TEMPLATE_MANAGE_PLUGINLUTECES, request.getLocale(  ), model );
    }

    /**
     * Returns the form to create a pluginlutece
     *
     * @param request The Http request
     * @return the html code of the pluginlutece form
     */
    @View( VIEW_CREATE_PLUGINLUTECE )
    public XPage getCreatePluginLutece( HttpServletRequest request )
    {
        _pluginlutece = ( _pluginlutece != null ) ? _pluginlutece : new PluginLutece(  );

        Map<String, Object> model = getModel(  );
        model.put( MARK_PLUGINLUTECE, _pluginlutece );
           
        return getXPage( TEMPLATE_CREATE_PLUGINLUTECE, request.getLocale(  ), model );
    }

    /**
     * Process the data capture form of a new pluginlutece
     *
     * @param request The Http Request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_CREATE_PLUGINLUTECE )
    public XPage doCreatePluginLutece( HttpServletRequest request )
    {
        populate( _pluginlutece, request );

        // Check constraints
        if ( !validateBean( _pluginlutece, getLocale( request ) ) )
        {
            return redirectView( request, VIEW_CREATE_PLUGINLUTECE );
        }

        PluginLuteceHome.create( _pluginlutece );
        addInfo( INFO_PLUGINLUTECE_CREATED, getLocale( request ) );

        return redirectView( request, VIEW_MANAGE_PLUGINLUTECES );
    }

    /**
     * Manages the removal form of a pluginlutece whose identifier is in the http
     * request
     *
     * @param request The Http request
     * @return the html code to confirm
     */
    @Action( ACTION_CONFIRM_REMOVE_PLUGINLUTECE )
    public XPage getConfirmRemovePluginLutece( HttpServletRequest request ) throws SiteMessageException
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );
        UrlItem url = new UrlItem( JSP_PAGE_PORTAL );
        url.addParameter( PARAM_PAGE, MARK_PLUGINLUTECE );
        url.addParameter( PARAM_ACTION, ACTION_REMOVE_PLUGINLUTECE );
        url.addParameter( PARAMETER_ID_PLUGINLUTECE, nId );
        
        SiteMessageService.setMessage(request, MESSAGE_CONFIRM_REMOVE_PLUGINLUTECE, SiteMessage.TYPE_CONFIRMATION, url.getUrl(  ));
        return null;
    }

    /**
     * Handles the removal form of a pluginlutece
     *
     * @param request The Http request
     * @return the jsp URL to display the form to manage pluginluteces
     */
    @Action( ACTION_REMOVE_PLUGINLUTECE )
    public XPage doRemovePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );
        PluginLuteceHome.remove( nId );
        addInfo( INFO_PLUGINLUTECE_REMOVED, getLocale( request ) );

        return redirectView( request, VIEW_MANAGE_PLUGINLUTECES );
    }

    /**
     * Returns the form to update info about a pluginlutece
     *
     * @param request The Http request
     * @return The HTML form to update info
     */
    @View( VIEW_MODIFY_PLUGINLUTECE )
    public XPage getModifyPluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );

        if ( _pluginlutece == null  || ( _pluginlutece.getId( ) != nId ))
        {
            _pluginlutece = PluginLuteceHome.findByPrimaryKey( nId );
        }

        Map<String, Object> model = getModel(  );
        model.put( MARK_PLUGINLUTECE, _pluginlutece );
        
        return getXPage( TEMPLATE_MODIFY_PLUGINLUTECE, request.getLocale(  ), model );
    }

    /**
     * Process the change form of a pluginlutece
     *
     * @param request The Http request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_MODIFY_PLUGINLUTECE )
    public XPage doModifyPluginLutece( HttpServletRequest request )
    {
        populate( _pluginlutece, request );

        // Check constraints
        if ( !validateBean( _pluginlutece, getLocale( request ) ) )
        {
            return redirect( request, VIEW_MODIFY_PLUGINLUTECE, PARAMETER_ID_PLUGINLUTECE, _pluginlutece.getId( ) );
        }

        PluginLuteceHome.update( _pluginlutece );
        addInfo( INFO_PLUGINLUTECE_UPDATED, getLocale( request ) );

        return redirectView( request, VIEW_MANAGE_PLUGINLUTECES );
    }
    
    @View( VIEW_FORM_PLUGINLUTECE )
    public XPage getFormPluginLutece( HttpServletRequest request )
    {
        _pluginlutece = ( _pluginlutece != null ) ? _pluginlutece : new PluginLutece(  );

        Map<String, Object> model = getModel(  );
        List<PluginLutece> listPluginLuteces = (List<PluginLutece>) PluginLuteceHome.getPluginLutecesList(  );
        Map<String,List<PluginLutece>> plugins = new HashMap<String,List<PluginLutece>>();
        List<DomainePluginLutece> domaines = (List<DomainePluginLutece>) DomainePluginLuteceHome.getDomainePluginLutecesList();
        for(DomainePluginLutece domaine:domaines){
            List<PluginLutece> list = new ArrayList<PluginLutece>();
            for(PluginLutece p:listPluginLuteces){
                if(p.getDomaine().equals(domaine.getDomaine()) && !list.contains(p))
                    list.add(p);
            }
            plugins.put(domaine.getDomaine(), list);
        }
        model.put(MARK_DOMAINE_LIST_PLUGINS, plugins );
        model.put(MARK_PLUGINLUTECE_LIST, mesPlugins() );
        
        return getXPage( TEMPLATE_FORM_PLUGINLUTECE, request.getLocale(  ), model );
    }
    
    /**
     * Returns the form to update info about a pluginlutece
     *
     * @param request The Http request
     * @return The HTML form to update info
     */
    @View( VIEW_FORM_GENERATE_PLUGINLUTECE )
    public XPage getFormGeneratePluginLutece( HttpServletRequest request )
    {

        Map<String, Object> model = getModel(  );
        Map<String,List<String>> versions = new HashMap<String,List<String>>();
        List<PluginLutece> mesplugins = (List<PluginLutece>) PluginLuteceHome.getPluginLutecesList();
        for(String p:plugins_list){
            List<String> list = new ArrayList<String>();
            for(PluginLutece pl:mesplugins){
                if(pl.getArtifactId().equals(p))
                    list.add(pl.getVersion());
            }
            versions.put(p, list);
        }
        
        model.put(MARK_VERSION_LIST_PLUGINS, versions );
        
        return getXPage( TEMPLATE_FORM_GENERATE_PLUGINLUTECE, request.getLocale(  ), model );
    }
    
    @Action( ACTION_GENERATE_POM_PLUGINLUTECE )
    public XPage doGeneratePomluginLutece( HttpServletRequest request) throws IOException 
    {
        //String versions[] = request.getParameter("versions").trim().split("\\*");
         if(request.getParameter("plugins") == null || request.getParameter("plugins").isEmpty())
            return redirectView( request, VIEW_FORM_PLUGINLUTECE );
        
        String data = request.getParameter("plugins");
       // String plugins[] = null;
        if(data.contains("*")){
            plugins_list = data.split("\\*");
        }else{
            plugins_list = new String[1];
            plugins_list[0] = data;      
        }
        //create the directory
        creerDirectory("DownloadDockerfile");
        creerDirectory("DownloadDockerfile/Docker");
        creerDirectory("DownloadDockerfile/Docker/Docker_client");
        BufferedWriter bufWriter = null;
        FileWriter fileWriter = null;
        /* Lecture du paramètre 'chemin' de localisation du fichier à télécharger */
	//String chemin = "/fichiers/pom2.txt";
        String chemin = "DownloadDockerfile/Docker/Docker_client/pom.txt";
        File filename = new File(chemin);
        try {
            fileWriter = new FileWriter(filename);
            bufWriter = new BufferedWriter(fileWriter);
            bufWriter.write("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
                    + "xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">");
            bufWriter.newLine();
            bufWriter.newLine();
            bufWriter.write("\t"+"<parent>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<artifactId>lutece-site-pom</artifactId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<groupId>fr.paris.lutece.tools</groupId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<version>2.0.0</version>");
            bufWriter.newLine();
            bufWriter.write("\t"+"</parent>");
            bufWriter.newLine();
            bufWriter.newLine();
            bufWriter.write("\t"+"<modelVersion>4.0.0</modelVersion>");
            bufWriter.newLine();
            bufWriter.write("\t"+"<groupId>fr.paris.lutece</groupId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"<artifactId>plugin-dockerlutece</artifactId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"<packaging>lutece-site</packaging>");
            bufWriter.newLine();
            bufWriter.write("\t"+"<name>Lutece dockerlutece plugin</name>");
            bufWriter.newLine();
            bufWriter.write("\t"+"<version>1.0.0-SNAPSHOT</version>");                    
            bufWriter.newLine();
            bufWriter.newLine();
            bufWriter.write("\t"+"<repositories>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<repository>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<id>lutece</id>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<name>luteceRepository</name>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<url>http://dev.lutece.paris.fr/maven_repository</url>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<layout>default</layout>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"</repository>");
            bufWriter.newLine();
            bufWriter.write("\t"+"</repositories>");
            bufWriter.newLine();
            bufWriter.newLine();
            bufWriter.write("\t"+"<dependencies>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<dependency>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<groupId>fr.paris.lutece</groupId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<artifactId>lutece-core</artifactId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<version>[5.0.0,)</version>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"\t"+"<type>lutece-core</type>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"</dependency>");
            List<PluginLutece> mesplugins = (List<PluginLutece>) PluginLuteceHome.getPluginLutecesList();
            for(String p:plugins_list){
                //Insérer un saut de ligne
                bufWriter.newLine();
                bufWriter.write("\t"+"\t"+"<dependency>");
                bufWriter.newLine();
                int i = 0;
                while(i < mesplugins.size() && !mesplugins.get(i).getArtifactId().equals(p)){
                        i++;
                }                            
                if(i < mesplugins.size()){  
                    bufWriter.write("\t"+"\t"+"\t"+"<groupId>"+mesplugins.get(i).getGroupId()+"</groupId>");
                    bufWriter.newLine();
                    //String vers[] = p.split("\\+");
                    bufWriter.write("\t"+"\t"+"\t"+"<artifactId>"+p+"</artifactId>");
                    bufWriter.newLine();  
                    bufWriter.write("\t"+"\t"+"\t"+"<version>"+mesplugins.get(i).getVersion()+"</version>");
                    bufWriter.newLine();
                    bufWriter.write("\t"+"\t"+"\t"+"<type>"+mesplugins.get(i).getType()+"</type>");
                }
               else{
                    bufWriter.write("\t"+"\t"+"\t"+"<groupId>fr.paris.lutece.plugins</groupId>");
                    bufWriter.newLine();
                    bufWriter.write("\t"+"\t"+"\t"+"<artifactId>"+p+"</artifactId>");
                    bufWriter.newLine();  
                    bufWriter.write("\t"+"\t"+"\t"+"<version>"+version(p)+"</version>");
                    bufWriter.newLine();
                    bufWriter.write("\t"+"\t"+"\t"+"<type>lutece_plugin</type>");
                }
                bufWriter.newLine();  
                bufWriter.write("\t"+"\t"+"</dependency>");
            }
            bufWriter.newLine();
            bufWriter.write("\t"+"</dependencies>");
            bufWriter.newLine();
            bufWriter.newLine();
            bufWriter.write("\t"+"<properties>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<componentName>dockerlutece</componentName>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<jiraProjectName>DOCKERLUTECE</jiraProjectName>");
            bufWriter.newLine();
            bufWriter.write("\t"+"\t"+"<jiraComponentId></jiraComponentId>");
            bufWriter.newLine();
            bufWriter.write("\t"+"</properties>");
            bufWriter.newLine();
            bufWriter.write("</project>");
            bufWriter.newLine();
            bufWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                bufWriter.close();
                fileWriter.close();
            } catch (IOException ex) {
               System.out.println(ex.getMessage());
            }
        }
        
        return redirectView( request, VIEW_FORM_PLUGINLUTECE );
    }
    
   @Action( ACTION_DOWNLOAD_PLUGINLUTECE )
    public XPage doDownloadluginLutece( HttpServletRequest request) throws IOException 
    {
        File source = new File("DownloadDockerfile/Docker/Docker_client/pom.txt");
        File f = new File("DownloadDockerfile/Docker/Docker_client/pom.xml");
        if(f.exists() && !f.isDirectory()) { 
            f.delete();
        }
        File destination = new File("DownloadDockerfile/Docker/Docker_client/pom.xml");
        source.renameTo(destination);
        try {
            downloadDokerfile("Dockerfile", "docker_client/","Docker/Docker_client/");
            downloadDokerfile("supervisord.conf", "docker_client/","Docker/Docker_client/");
            downloadDokerfile("docker-compose.yml", "", "Docker/");
          } catch (Throwable ex) {
              
          }
        compress(new File("DownloadDockerfile"), new File("."), Deflater.BEST_SPEED);
        download("DownloadDockerfile.zip");
        return redirectView( request, VIEW_FORM_PLUGINLUTECE );
    }
    public void download(String chemin) throws IOException{
        HttpServletResponse response = LocalVariables.getResponse(  );
       /* Lecture du paramètre 'chemin' de localisation du fichier à télécharger */
        File fichier = new File(chemin);
	/* Récupère le type du fichier */
        URL url = fichier.toURL();
        URLConnection connection = url.openConnection();
        String type = connection.getContentType();
        /* Si le type de fichier est inconnu, alors on initialise un type par défaut */
	if ( type == null ) {
            type = "application/octet-stream";
	}
	/* Initialise la réponse HTTP */
	response.reset();
	response.setBufferSize( TAILLE_TAMPON );
	response.setContentType( type );
	response.setHeader( "Content-Length", String.valueOf( fichier.length() ) );
	response.setHeader( "Content-Disposition", "attachment; filename=\"" + fichier.getName() + "\"" );
	/* Prépare les flux */
	BufferedInputStream entree = null;
	BufferedOutputStream sortie = null;
	try {
		/* Ouvre les flux */
		entree = new BufferedInputStream( new FileInputStream( fichier ), TAILLE_TAMPON );
		sortie = new BufferedOutputStream( response.getOutputStream(), TAILLE_TAMPON );
		/* Lit le fichier et écrit son contenu dans la réponse HTTP */
		byte[] tampon = new byte[TAILLE_TAMPON];
		int longueur;
		while ( ( longueur= entree.read( tampon ) ) > 0 ) {
		        sortie.write( tampon, 0, longueur );
		}
	} finally {
                    try {
		        sortie.close();
		    } catch ( IOException ignore ) {
		    }
		    try {
		        entree.close();
		    } catch ( IOException ignore ) {
		    }
	}
    }
    
    public void creerDirectory(String directory){
        //create the directory
        File theDir = new File(directory);
        // if the directory does not exist, create it
        if (!theDir.exists()) {

            try{
                theDir.mkdir();
            } 
            catch(SecurityException se){
                //handle it
            }               
        }
    }
    
    public String version(String p){
        String version = "Release not found";
         try{
                String ur = "http://dev.lutece.paris.fr/nexus/content/groups/snapshot_repository/fr/paris/lutece/plugins/"+p+"/maven-metadata.xml";
                URL url = new URL(ur);
                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                con.setRequestMethod("GET");
                InputStream result = con.getInputStream();
                if(result != null){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(result));
                    StringBuilder data2 = new StringBuilder();
                    String line;
                    
                    while ((line = reader.readLine()) != null) {
                            if(line.trim().contains("latest")){
                                version = line.substring(12, 26);
                            }
                            data2.append(line.trim());
                            data2.append("\n");
                    }                   
                        reader.close();
                    }
                
            } catch (MalformedURLException ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            }
         return version;
    }
    
    // Remplace l'extension si le fichier cible ne fini pas par '.zip'
	private static File getZipTypeFile(final File source, final File target)
	throws IOException {
		if (target.getName().toLowerCase().endsWith(ZIP_EXTENSION))
			return target;
		final String tName = target.isDirectory()
			? source.getName()
			: target.getName();
		final int index = tName.lastIndexOf('.');
		return new File(
			new StringBuilder(target.isDirectory()
					? target.getCanonicalPath()
					: target.getParentFile().getCanonicalPath())
				.append(File.separatorChar)
				.append(index < 0 ? tName : tName.substring(0 ,index))
				.append(ZIP_EXTENSION)
			.toString()
		);
	}
    
    private static void compressFile(final ZipOutputStream out, final String parentFolder, final File file) throws IOException {
        final String zipName = new StringBuilder(parentFolder)
        	.append(file.getName())
        	.append(file.isDirectory() ? '/' : "")
        	.toString();
        
        // Définition des attributs du fichier
        final ZipEntry entry = new ZipEntry(zipName);
        entry.setSize(file.length());
    	entry.setTime(file.lastModified());
        out.putNextEntry(entry);
        
        // Traitement récursif s'il s'agit d'un répertoire
        if (file.isDirectory()) {
        	for (final File f : file.listFiles())
        		compressFile(out, zipName.toString(), f);
        	return;
        }
        
        // Ecriture du fichier dans le zip
    	final InputStream in = new BufferedInputStream(
    			new FileInputStream(file));
        try {
            final byte[] buf = new byte[8192];
            int bytesRead;
            while (-1 != (bytesRead = in.read(buf)))
                out.write(buf, 0, bytesRead);
        } finally {          
            in.close();
        }
    }
	
	// Compresse un fichier à l'adresse pointée par le fichier cible.
	// Remplace le fichier cible s'il existe déjà.
	public static void compress(final File file, final File target, final int compressionLevel) throws IOException {
		final File source = file.getCanonicalFile();
		
		// Création du fichier zip
        final ZipOutputStream out = new ZipOutputStream(new FileOutputStream(
        		getZipTypeFile(source, target.getCanonicalFile())));
        out.setMethod(ZipOutputStream.DEFLATED);
        out.setLevel(compressionLevel);
        
        // Ajout du(es) fichier(s) au zip
        compressFile(out, "", source);   
        out.close();
	}
    public void copyFile (File src, File dest) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(src));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buf = new byte[4096];
        int n;
        while ((n=in.read(buf, 0, buf.length)) > 0)
        out.write(buf, 0, n);

        in.close();
        out.close();
    }
    
     public List<String> mesPlugins(){       
         List<String> plugins = new ArrayList<String>();
        try{
            String ur = "http://dev.lutece.paris.fr/nexus/content/groups/snapshot_repository/fr/paris/lutece/plugins/";
            URL url = new URL(ur);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            InputStream result = con.getInputStream();
            if(result != null){
                BufferedReader reader = new BufferedReader(new InputStreamReader(result));
                String line;
                String version="";
                while ((line = reader.readLine()) != null) {
                    if(line.trim().contains("<td><a href=\"http:")){
                        version = line.substring(line.indexOf("/plugins/"), line.indexOf("/\""));
                        plugins.add(version.substring(9));
                    }
                }   
                for(PluginLutece p:PluginLuteceHome.getPluginLutecesList()){
                     if(plugins.contains(p.getArtifactId()))
                             plugins.remove(p.getArtifactId());
                }
                reader.close();
            }
                
        } catch (MalformedURLException ex) {
                ex.getMessage();
        } catch (IOException ex) {
                ex.getMessage();
        }
        return plugins;
     }
     
     private static boolean isRedirected( Map<String, List<String>> header ) {
        for( String hv : header.get( null )) {
           if(   hv.contains( " 301 " )
              || hv.contains( " 302 " )) return true;
        }
      return false;
   }
     
      public static void downloadDokerfile(String file, String directoryGit, String directoryHost) throws Throwable{
       
      String link = "https://raw.githubusercontent.com/mandione10/tuto/master/"+directoryGit+file;
      String fileName = "DownloadDockerfile/"+directoryHost+file;
      URL url  = new URL( link );
      HttpURLConnection http = (HttpURLConnection)url.openConnection();
      Map< String, List< String >> header = http.getHeaderFields();
      while( isRedirected( header )) {
         link = header.get( "Location" ).get( 0 );
         url    = new URL( link );
         http   = (HttpURLConnection)url.openConnection();
         header = http.getHeaderFields();
      }
      InputStream  input  = http.getInputStream();
      byte[]       buffer = new byte[4096];
      int          n      = -1;
      OutputStream output = new FileOutputStream( new File( fileName ));
      while ((n = input.read(buffer)) != -1) {
         output.write( buffer, 0, n );
      }
      output.close();
   }
}
