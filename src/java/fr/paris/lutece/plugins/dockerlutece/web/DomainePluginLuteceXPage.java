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
import javax.servlet.http.HttpServletRequest; 

/**
 * This class provides the user interface to manage DomainePluginLutece xpages ( manage, create, modify, remove )
 */
 
@Controller( xpageName = "domainepluginlutece" , pageTitleI18nKey = "dockerlutece.xpage.domainepluginlutece.pageTitle" , pagePathI18nKey = "dockerlutece.xpage.domainepluginlutece.pagePathLabel" )
public class DomainePluginLuteceXPage extends MVCApplication
{
    // Templates
    private static final String TEMPLATE_MANAGE_DOMAINEPLUGINLUTECES="/skin/plugins/dockerlutece/manage_domainepluginluteces.html";
    private static final String TEMPLATE_CREATE_DOMAINEPLUGINLUTECE="/skin/plugins/dockerlutece/create_domainepluginlutece.html";
    private static final String TEMPLATE_MODIFY_DOMAINEPLUGINLUTECE="/skin/plugins/dockerlutece/modify_domainepluginlutece.html";
    
    // JSP
    private static final String JSP_PAGE_PORTAL = "jsp/site/Portal.jsp";
    
    // Parameters
    private static final String PARAMETER_ID_DOMAINEPLUGINLUTECE="id";
    private static final String PARAM_ACTION = "action";
    private static final String PARAM_PAGE = "page";
    
    // Markers
    private static final String MARK_DOMAINEPLUGINLUTECE_LIST = "domainepluginlutece_list";
    private static final String MARK_DOMAINEPLUGINLUTECE = "domainepluginlutece";
    
    // Message
    private static final String MESSAGE_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE = "dockerlutece.message.confirmRemoveDomainePluginLutece";
    
    // Views
    private static final String VIEW_MANAGE_DOMAINEPLUGINLUTECES = "manageDomainePluginLuteces";
    private static final String VIEW_CREATE_DOMAINEPLUGINLUTECE = "createDomainePluginLutece";
    private static final String VIEW_MODIFY_DOMAINEPLUGINLUTECE = "modifyDomainePluginLutece";

    // Actions
    private static final String ACTION_CREATE_DOMAINEPLUGINLUTECE = "createDomainePluginLutece";
    private static final String ACTION_MODIFY_DOMAINEPLUGINLUTECE= "modifyDomainePluginLutece";
    private static final String ACTION_REMOVE_DOMAINEPLUGINLUTECE = "removeDomainePluginLutece";
    private static final String ACTION_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE = "confirmRemoveDomainePluginLutece";

    // Infos
    private static final String INFO_DOMAINEPLUGINLUTECE_CREATED = "dockerlutece.info.domainepluginlutece.created";
    private static final String INFO_DOMAINEPLUGINLUTECE_UPDATED = "dockerlutece.info.domainepluginlutece.updated";
    private static final String INFO_DOMAINEPLUGINLUTECE_REMOVED = "dockerlutece.info.domainepluginlutece.removed";
    
    // Session variable to store working values
    private DomainePluginLutece _domainepluginlutece;
    
    @View( value = VIEW_MANAGE_DOMAINEPLUGINLUTECES, defaultView = true )
    public XPage getManageDomainePluginLuteces( HttpServletRequest request )
    {
        _domainepluginlutece = null;
        Map<String, Object> model = getModel(  );
        model.put( MARK_DOMAINEPLUGINLUTECE_LIST, DomainePluginLuteceHome.getDomainePluginLutecesList(  ) );

        return getXPage( TEMPLATE_MANAGE_DOMAINEPLUGINLUTECES, request.getLocale(  ), model );
    }

    /**
     * Returns the form to create a domainepluginlutece
     *
     * @param request The Http request
     * @return the html code of the domainepluginlutece form
     */
    @View( VIEW_CREATE_DOMAINEPLUGINLUTECE )
    public XPage getCreateDomainePluginLutece( HttpServletRequest request )
    {
        _domainepluginlutece = ( _domainepluginlutece != null ) ? _domainepluginlutece : new DomainePluginLutece(  );

        Map<String, Object> model = getModel(  );
        model.put( MARK_DOMAINEPLUGINLUTECE, _domainepluginlutece );
           
        return getXPage( TEMPLATE_CREATE_DOMAINEPLUGINLUTECE, request.getLocale(  ), model );
    }

    /**
     * Process the data capture form of a new domainepluginlutece
     *
     * @param request The Http Request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_CREATE_DOMAINEPLUGINLUTECE )
    public XPage doCreateDomainePluginLutece( HttpServletRequest request )
    {
        populate( _domainepluginlutece, request );

        // Check constraints
        if ( !validateBean( _domainepluginlutece, getLocale( request ) ) )
        {
            return redirectView( request, VIEW_CREATE_DOMAINEPLUGINLUTECE );
        }

        DomainePluginLuteceHome.create( _domainepluginlutece );
        addInfo( INFO_DOMAINEPLUGINLUTECE_CREATED, getLocale( request ) );

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
    public XPage getConfirmRemoveDomainePluginLutece( HttpServletRequest request ) throws SiteMessageException
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );
        UrlItem url = new UrlItem( JSP_PAGE_PORTAL );
        url.addParameter( PARAM_PAGE, MARK_DOMAINEPLUGINLUTECE );
        url.addParameter( PARAM_ACTION, ACTION_REMOVE_DOMAINEPLUGINLUTECE );
        url.addParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE, nId );
        
        SiteMessageService.setMessage(request, MESSAGE_CONFIRM_REMOVE_DOMAINEPLUGINLUTECE, SiteMessage.TYPE_CONFIRMATION, url.getUrl(  ));
        return null;
    }

    /**
     * Handles the removal form of a domainepluginlutece
     *
     * @param request The Http request
     * @return the jsp URL to display the form to manage domainepluginluteces
     */
    @Action( ACTION_REMOVE_DOMAINEPLUGINLUTECE )
    public XPage doRemoveDomainePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );
        DomainePluginLuteceHome.remove( nId );
        addInfo( INFO_DOMAINEPLUGINLUTECE_REMOVED, getLocale( request ) );

        return redirectView( request, VIEW_MANAGE_DOMAINEPLUGINLUTECES );
    }

    /**
     * Returns the form to update info about a domainepluginlutece
     *
     * @param request The Http request
     * @return The HTML form to update info
     */
    @View( VIEW_MODIFY_DOMAINEPLUGINLUTECE )
    public XPage getModifyDomainePluginLutece( HttpServletRequest request )
    {
        int nId = Integer.parseInt( request.getParameter( PARAMETER_ID_DOMAINEPLUGINLUTECE ) );

        if ( _domainepluginlutece == null  || ( _domainepluginlutece.getId( ) != nId ))
        {
            _domainepluginlutece = DomainePluginLuteceHome.findByPrimaryKey( nId );
        }

        Map<String, Object> model = getModel(  );
        model.put( MARK_DOMAINEPLUGINLUTECE, _domainepluginlutece );
        
        return getXPage( TEMPLATE_MODIFY_DOMAINEPLUGINLUTECE, request.getLocale(  ), model );
    }

    /**
     * Process the change form of a domainepluginlutece
     *
     * @param request The Http request
     * @return The Jsp URL of the process result
     */
    @Action( ACTION_MODIFY_DOMAINEPLUGINLUTECE )
    public XPage doModifyDomainePluginLutece( HttpServletRequest request )
    {
        populate( _domainepluginlutece, request );

        // Check constraints
        if ( !validateBean( _domainepluginlutece, getLocale( request ) ) )
        {
            return redirect( request, VIEW_MODIFY_DOMAINEPLUGINLUTECE, PARAMETER_ID_DOMAINEPLUGINLUTECE, _domainepluginlutece.getId( ) );
        }

        DomainePluginLuteceHome.update( _domainepluginlutece );
        addInfo( INFO_DOMAINEPLUGINLUTECE_UPDATED, getLocale( request ) );

        return redirectView( request, VIEW_MANAGE_DOMAINEPLUGINLUTECES );
    }
}
