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
import fr.paris.lutece.portal.service.message.AdminMessage;
import fr.paris.lutece.portal.service.message.AdminMessageService;
import fr.paris.lutece.portal.util.mvc.admin.annotations.Controller;
import fr.paris.lutece.portal.util.mvc.commons.annotations.Action;
import fr.paris.lutece.portal.util.mvc.commons.annotations.View;
import fr.paris.lutece.util.url.UrlItem;

import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;


/**
 * This class provides the user interface to manage DomainePluginLutece features ( manage, create, modify, remove )
 */
@Controller( controllerJsp = "ManageDomainePluginLuteces.jsp", controllerPath = "jsp/admin/plugins/dockerlutece/", right = "DOCKERLUTECE_MANAGEMENT" )
public class DomainePluginLuteceJspBean extends ManageDomaineDockerluteceJspBean
{

    ////////////////////////////////////////////////////////////////////////////
    // Constants

    // templates
    private static final String TEMPLATE_MANAGE_DOMAINEPLUGINLUTECES = "/admin/plugins/dockerlutece/manage_domainepluginluteces.html";
    private static final String TEMPLATE_CREATE_DOMAINEPLUGINLUTECE = "/admin/plugins/dockerlutece/create_domainepluginlutece.html";
    private static final String TEMPLATE_MODIFY_DOMAINEPLUGINLUTECE = "/admin/plugins/dockerlutece/modify_domainepluginlutece.html";


    // Parameters
    private static final String PARAMETER_ID_DOMAINEPLUGINLUTECE = "id";

    // Properties for page titles
    private static final String PROPERTY_PAGE_TITLE_MANAGE_DOMAINEPLUGINLUTECES = "dockerlutece.manage_domainepluginluteces.pageTitle";
    private static final String PROPERTY_PAGE_TITLE_MODIFY_DOMAINEPLUGINLUTECE = "dockerlutece.modify_domainepluginlutece.pageTitle";
    private static final String PROPERTY_PAGE_TITLE_CREATE_DOMAINEPLUGINLUTECE = "dockerlutece.create_domainepluginlutece.pageTitle";

    // Markers
    private static final String MARK_DOMAINEPLUGINLUTECE_LIST = "domainepluginlutece_list";
    private static final String MARK_DOMAINEPLUGINLUTECE = "domainepluginlutece";

    private static final String JSP_MANAGE_DOMAINEPLUGINLUTECES = "jsp/admin/plugins/dockerlutece/ManageDomainePluginLuteces.jsp";

    // Properties
    private static final String MESSAGE_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE = "dockerlutece.message.confirmRemoveDomainePluginLutece";
    //private static final String MESSAGE_DUPLICA_DOMAINEPLUGINLUTECE = "dockerlutece.message.duplicaDomainePluginLutece";
    private static final String PROPERTY_DEFAULT_LIST_DOMAINEPLUGINLUTECE_PER_PAGE = "dockerlutece.listDomainePluginLuteces.itemsPerPage";
 
    private static final String VALIDATION_ATTRIBUTES_PREFIX = "dockerlutece.model.entity.domainepluginlutece.attribute.";

    // Views
    private static final String VIEW_MANAGE_DOMAINEPLUGINLUTECES = "manageDomainePluginLuteces";
    private static final String VIEW_CREATE_DOMAINEPLUGINLUTECE = "createDomainePluginLutece";
    private static final String VIEW_MODIFY_DOMAINEPLUGINLUTECE = "modifyDomainePluginLutece";

    // Actions
    private static final String ACTION_CREATE_DOMAINEPLUGINLUTECE = "createDomainePluginLutece";
    private static final String ACTION_MODIFY_DOMAINEPLUGINLUTECE = "modifyDomainePluginLutece";
    private static final String ACTION_REMOVE_DOMAINEPLUGINLUTECE = "removeDomainePluginLutece";
    private static final String ACTION_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE = "confirmRemoveDomainePluginLutece";

    // Infos
    private static final String INFO_DOMAINEPLUGINLUTECE_CREATED = "dockerlutece.info.domainepluginlutece.created";
    private static final String INFO_DOMAINEPLUGINLUTECE_UPDATED = "dockerlutece.info.domainepluginlutece.updated";
    private static final String INFO_DOMAINEPLUGINLUTECE_REMOVED = "dockerlutece.info.domainepluginlutece.removed";
    
    // Session variable to store working values
    private DomainePluginLutece _domainepluginlutece;
    private String messages;
    
    
    @View( value = VIEW_MANAGE_DOMAINEPLUGINLUTECES, defaultView = true )
    public String getManageDomainePluginLuteces( HttpServletRequest request )
    {
        _domainepluginlutece = null;
        messages = "";
        List<DomainePluginLutece> listDomainePluginLuteces = (List<DomainePluginLutece>) DomainePluginLuteceHome.getDomainePluginLutecesList(  );
        Map<String, Object> model = getPaginatedListModel( request, MARK_DOMAINEPLUGINLUTECE_LIST, listDomainePluginLuteces, JSP_MANAGE_DOMAINEPLUGINLUTECES );
        return getPage( PROPERTY_PAGE_TITLE_MANAGE_DOMAINEPLUGINLUTECES, TEMPLATE_MANAGE_DOMAINEPLUGINLUTECES, model );
    }

    /**
     * Returns the form to create a domainepluginlutece
     *
     * @param request The Http request
     * @return the html code of the domainepluginlutece form
     */
    @View( VIEW_CREATE_DOMAINEPLUGINLUTECE )
    public String getCreateDomainePluginLutece( HttpServletRequest request )
    {
        _domainepluginlutece = ( _domainepluginlutece != null ) ? _domainepluginlutece : new DomainePluginLutece(  );

        Map<String, Object> model = getModel(  );
        model.put( MARK_DOMAINEPLUGINLUTECE, _domainepluginlutece );
        model.put( "info_domaine", messages);
        return getPage( PROPERTY_PAGE_TITLE_CREATE_DOMAINEPLUGINLUTECE, TEMPLATE_CREATE_DOMAINEPLUGINLUTECE, model );
    }

    /**
     * Process the data capture form of a new domainepluginlutece
     *
     * @param request The Http Request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_CREATE_DOMAINEPLUGINLUTECE )
    public String doCreateDomainePluginLutece( HttpServletRequest request )
    {
        populate( _domainepluginlutece, request );
        // Check constraints
        if ( !validateBean( _domainepluginlutece, VALIDATION_ATTRIBUTES_PREFIX ))
        {
            return redirectView( request, VIEW_CREATE_DOMAINEPLUGINLUTECE );
        }
        
        if(!validateDomaine(request.getParameter("domaine"))){
            messages = "Ce domaine existe. veuillez entrer un domaine valide.";
            return redirectView( request, VIEW_CREATE_DOMAINEPLUGINLUTECE );
        }           
        
        DomainePluginLuteceHome.create( _domainepluginlutece );
        addInfo( INFO_DOMAINEPLUGINLUTECE_CREATED, getLocale(  ) );

        return redirectView( request, VIEW_MANAGE_DOMAINEPLUGINLUTECES );
    }

    /**
     * Manages the removal form of a domainepluginlutece whose identifier is in the http
     * request
     *
     * @param request The Http request
     * @return the html code to confirm
     */
    @Action( ACTION_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE )
    public String getConfirmRemoveDomainePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );
        UrlItem url = new UrlItem( getActionUrl( ACTION_REMOVE_DOMAINEPLUGINLUTECE ) );
        url.addParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE, nId );

        String strMessageUrl = AdminMessageService.getMessageUrl( request, MESSAGE_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE,
                url.getUrl(  ), AdminMessage.TYPE_CONFIRMATION );

        return redirect( request, strMessageUrl );
    }

    /**
     * Handles the removal form of a domainepluginlutece
     *
     * @param request The Http request
     * @return the jsp URL to display the form to manage domainepluginluteces
     */
    @Action( ACTION_REMOVE_DOMAINEPLUGINLUTECE )
    public String doRemoveDomainePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );
        DomainePluginLuteceHome.remove( nId );
        addInfo( INFO_DOMAINEPLUGINLUTECE_REMOVED, getLocale(  ) );

        return redirectView( request, VIEW_MANAGE_DOMAINEPLUGINLUTECES );
    }

    /**
     * Returns the form to update info about a domainepluginlutece
     *
     * @param request The Http request
     * @return The HTML form to update info
     */
    @View( VIEW_MODIFY_DOMAINEPLUGINLUTECE )
    public String getModifyDomainePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );

        if ( _domainepluginlutece == null || ( _domainepluginlutece.getId(  ) != nId ))
        {
            _domainepluginlutece = DomainePluginLuteceHome.findByPrimaryKey( nId );
        }

        Map<String, Object> model = getModel(  );
        model.put( MARK_DOMAINEPLUGINLUTECE, _domainepluginlutece );

        return getPage( PROPERTY_PAGE_TITLE_MODIFY_DOMAINEPLUGINLUTECE, TEMPLATE_MODIFY_DOMAINEPLUGINLUTECE, model );
    }

    /**
     * Process the change form of a domainepluginlutece
     *
     * @param request The Http request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_MODIFY_DOMAINEPLUGINLUTECE )
    public String doModifyDomainePluginLutece( HttpServletRequest request )
    {
        populate( _domainepluginlutece, request );

        // Check constraints
        if ( !validateBean( _domainepluginlutece, VALIDATION_ATTRIBUTES_PREFIX ) )
        {
            return redirect( request, VIEW_MODIFY_DOMAINEPLUGINLUTECE, PARAMETER_ID_DOMAINEPLUGINLUTECE, _domainepluginlutece.getId( ) );
        }

        DomainePluginLuteceHome.update( _domainepluginlutece );
        addInfo( INFO_DOMAINEPLUGINLUTECE_UPDATED, getLocale(  ) );

        return redirectView( request, VIEW_MANAGE_DOMAINEPLUGINLUTECES );
    }
    
    public boolean validateDomaine(String domaine){
        List<DomainePluginLutece> domaines = (List<DomainePluginLutece>) DomainePluginLuteceHome.getDomainePluginLutecesList();
        if(domaines.isEmpty())
            return true;
        int i = 0;
        while(i < domaines.size() && !domaines.get(i).getDomaine().equals(domaine))
            i++;
        return (i==domaines.size());
    }
}
