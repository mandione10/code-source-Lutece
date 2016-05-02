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
import fr.paris.lutece.portal.service.message.AdminMessage;
import fr.paris.lutece.portal.service.message.AdminMessageService;
import fr.paris.lutece.portal.util.mvc.admin.annotations.Controller;
import fr.paris.lutece.portal.util.mvc.commons.annotations.Action;
import fr.paris.lutece.portal.util.mvc.commons.annotations.View;
import fr.paris.lutece.util.beanvalidation.ValidationError;
import fr.paris.lutece.util.url.UrlItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;


/**
 * This class provides the user interface to manage PluginLutece features ( manage, create, modify, remove )
 */
@Controller( controllerJsp = "ManagePluginLuteces.jsp", controllerPath = "jsp/admin/plugins/dockerlutece/", right = "DOCKERLUTECE_MANAGEMENT" )
public class PluginLuteceJspBean extends ManagePluginDockerluteceJspBean
{

    ////////////////////////////////////////////////////////////////////////////
    // Constants

    // templates
    private static final String TEMPLATE_MANAGE_PLUGINLUTECES = "/admin/plugins/dockerlutece/manage_pluginluteces.html";
    private static final String TEMPLATE_CREATE_PLUGINLUTECE = "/admin/plugins/dockerlutece/create_pluginlutece.html";
    private static final String TEMPLATE_MODIFY_PLUGINLUTECE = "/admin/plugins/dockerlutece/modify_pluginlutece.html";


    // Parameters
    private static final String PARAMETER_ID_PLUGINLUTECE = "id";

    // Properties for page titles
    private static final String PROPERTY_PAGE_TITLE_MANAGE_PLUGINLUTECES = "dockerlutece.manage_pluginluteces.pageTitle";
    private static final String PROPERTY_PAGE_TITLE_MODIFY_PLUGINLUTECE = "dockerlutece.modify_pluginlutece.pageTitle";
    private static final String PROPERTY_PAGE_TITLE_CREATE_PLUGINLUTECE = "dockerlutece.create_pluginlutece.pageTitle";

    // Markers
    private static final String MARK_PLUGINLUTECE_LIST = "pluginlutece_list";
    private static final String MARK_PLUGINLUTECE = "pluginlutece";
    
    // Markers domaine
    private static final String MARK_DOMAINEPLUGINLUTECE_LIST = "domainepluginlutece_list";
    private static final String MARK_DOMAINEPLUGINLUTECE = "domainepluginlutece";
    
    
    private static final String JSP_MANAGE_PLUGINLUTECES = "jsp/admin/plugins/dockerlutece/ManagePluginLuteces.jsp";

    // Properties
    private static final String MESSAGE_CONFIRM_REMOVE_PLUGINLUTECE = "dockerlutece.message.confirmRemovePluginLutece";
    //private static final String MESSAGE_DUPLICA_PLUGINLUTECE = "dockerlutece.message.duplicaPluginLutece";
    private static final String PROPERTY_DEFAULT_LIST_PLUGINLUTECE_PER_PAGE = "dockerlutece.listPluginLuteces.itemsPerPage";
 
    private static final String VALIDATION_ATTRIBUTES_PREFIX = "dockerlutece.model.entity.pluginlutece.attribute.";

    // Views
    private static final String VIEW_MANAGE_PLUGINLUTECES = "managePluginLuteces";
    private static final String VIEW_CREATE_PLUGINLUTECE = "createPluginLutece";
    private static final String VIEW_MODIFY_PLUGINLUTECE = "modifyPluginLutece";

    // Actions
    private static final String ACTION_CREATE_PLUGINLUTECE = "createPluginLutece";
    private static final String ACTION_MODIFY_PLUGINLUTECE = "modifyPluginLutece";
    private static final String ACTION_REMOVE_PLUGINLUTECE = "removePluginLutece";
    private static final String ACTION_CONFIRM_REMOVE_PLUGINLUTECE = "confirmRemovePluginLutece";

    // Infos
    private static final String INFO_PLUGINLUTECE_CREATED = "dockerlutece.info.pluginlutece.created";
    private static final String INFO_PLUGINLUTECE_UPDATED = "dockerlutece.info.pluginlutece.updated";
    private static final String INFO_PLUGINLUTECE_REMOVED = "dockerlutece.info.pluginlutece.removed";
    
    // Session variable to store working values
    private PluginLutece _pluginlutece;
    private String messages;
    
    
    @View( value = VIEW_MANAGE_PLUGINLUTECES, defaultView = true )
    public String getManagePluginLuteces( HttpServletRequest request )
    {
        _pluginlutece = null;
        List<PluginLutece> listPluginLuteces = (List<PluginLutece>) PluginLuteceHome.getPluginLutecesList(  );
        messages = "";
        Map<String, Object> model = getPaginatedListModel( request, MARK_PLUGINLUTECE_LIST, listPluginLuteces, JSP_MANAGE_PLUGINLUTECES );
       

        return getPage( PROPERTY_PAGE_TITLE_MANAGE_PLUGINLUTECES, TEMPLATE_MANAGE_PLUGINLUTECES, model );
    }

    /**
     * Returns the form to create a pluginlutece
     *
     * @param request The Http request
     * @return the html code of the pluginlutece form
     */
    @View( VIEW_CREATE_PLUGINLUTECE )
    public String getCreatePluginLutece( HttpServletRequest request )
    {
        _pluginlutece = ( _pluginlutece != null ) ? _pluginlutece : new PluginLutece(  );

        Map<String, Object> model = getModel(  );
        model.put( MARK_PLUGINLUTECE, _pluginlutece );
        List<DomainePluginLutece> listDomainePluginLuteces = (List<DomainePluginLutece>) DomainePluginLuteceHome.getDomainePluginLutecesList(  );
        model.put(MARK_DOMAINEPLUGINLUTECE_LIST, listDomainePluginLuteces);
        model.put( "info_domaine", messages);
        return getPage( PROPERTY_PAGE_TITLE_CREATE_PLUGINLUTECE, TEMPLATE_CREATE_PLUGINLUTECE, model );
    }

    /**
     * Process the data capture form of a new pluginlutece
     *
     * @param request The Http Request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_CREATE_PLUGINLUTECE )
    public String doCreatePluginLutece( HttpServletRequest request )
    {
        populate( _pluginlutece, request );

        // Check constraints
        if ( !validateBean( _pluginlutece, VALIDATION_ATTRIBUTES_PREFIX ) )
        {
            return redirectView( request, VIEW_CREATE_PLUGINLUTECE );
        }
        if(!validateArtifact(request.getParameter("artifact_id").trim())){
            messages = "Ce plugin ne peut pas &ecirc;tre dupliqu&eacute;. veuillez entrer un autre plugin valide.";

            return redirectView( request, VIEW_CREATE_PLUGINLUTECE );
           
        }
        if(!mesPlugins().contains(request.getParameter("artifact_id").trim())){
            messages = "Ce plugin n'existe pas dans la repository de Lut&egrave;ce. veuillez entrer un plugin valide.";
          
            return redirectView( request, VIEW_CREATE_PLUGINLUTECE );
        }

        PluginLuteceHome.create( _pluginlutece );
        addInfo( INFO_PLUGINLUTECE_CREATED, getLocale(  ) );

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
    public String getConfirmRemovePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );
        UrlItem url = new UrlItem( getActionUrl( ACTION_REMOVE_PLUGINLUTECE ) );
        url.addParameter( PARAMETER_ID_PLUGINLUTECE, nId );

        String strMessageUrl = AdminMessageService.getMessageUrl( request, MESSAGE_CONFIRM_REMOVE_PLUGINLUTECE,
                url.getUrl(  ), AdminMessage.TYPE_CONFIRMATION );

        return redirect( request, strMessageUrl );
    }

    /**
     * Handles the removal form of a pluginlutece
     *
     * @param request The Http request
     * @return the jsp URL to display the form to manage pluginluteces
     */
    @Action( ACTION_REMOVE_PLUGINLUTECE )
    public String doRemovePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );
        PluginLuteceHome.remove( nId );
        addInfo( INFO_PLUGINLUTECE_REMOVED, getLocale(  ) );

        return redirectView( request, VIEW_MANAGE_PLUGINLUTECES );
    }

    /**
     * Returns the form to update info about a pluginlutece
     *
     * @param request The Http request
     * @return The HTML form to update info
     */
    @View( VIEW_MODIFY_PLUGINLUTECE )
    public String getModifyPluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_PLUGINLUTECE ) );

        if ( _pluginlutece == null || ( _pluginlutece.getId(  ) != nId ))
        {
            _pluginlutece = PluginLuteceHome.findByPrimaryKey( nId );
        }

        Map<String, Object> model = getModel(  );
        List<DomainePluginLutece> listDomainePluginLuteces = (List<DomainePluginLutece>) DomainePluginLuteceHome.getDomainePluginLutecesList(  );
        model.put(MARK_DOMAINEPLUGINLUTECE_LIST, listDomainePluginLuteces);
        model.put( MARK_PLUGINLUTECE, _pluginlutece );

        return getPage( PROPERTY_PAGE_TITLE_MODIFY_PLUGINLUTECE, TEMPLATE_MODIFY_PLUGINLUTECE, model );
    }

    /**
     * Process the change form of a pluginlutece
     *
     * @param request The Http request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_MODIFY_PLUGINLUTECE )
    public String doModifyPluginLutece( HttpServletRequest request )
    {
        populate( _pluginlutece, request );

        // Check constraints
        if ( !validateBean( _pluginlutece, VALIDATION_ATTRIBUTES_PREFIX ) )
        {
            return redirect( request, VIEW_MODIFY_PLUGINLUTECE, PARAMETER_ID_PLUGINLUTECE, _pluginlutece.getId( ) );
        }

        PluginLuteceHome.update( _pluginlutece );
        addInfo( INFO_PLUGINLUTECE_UPDATED, getLocale(  ) );

        return redirectView( request, VIEW_MANAGE_PLUGINLUTECES );
    }
    
     public boolean validateArtifact(String artifact){
        List<PluginLutece> plugins = (List<PluginLutece>) PluginLuteceHome.getPluginLutecesList();
        int i = 0;
        while(i < plugins.size() && !plugins.get(i).getArtifactId().equals(artifact))
            i++;
        return (i==plugins.size());
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
                reader.close();
            }
        } catch (MalformedURLException ex) {
                ex.getMessage();
        } catch (IOException ex) {
                ex.getMessage();
        }
        return plugins;
     }
}
