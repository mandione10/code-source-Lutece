/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *	 and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *	 and the following disclaimer in the documentation and/or other materials
 *	 provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *	 contributors may be used to endorse or promote products derived from
 *	 this software without specific prior written permission.
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


package fr.paris.lutece.plugins.dockerlutece.business;

import fr.paris.lutece.portal.service.plugin.Plugin;
import fr.paris.lutece.util.sql.DAOUtil;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class provides Data Access methods for DomainePluginLutece objects
 */

public final class DomainePluginLuteceDAO implements IDomainePluginLuteceDAO
{
    // Constants
    private static final String SQL_QUERY_NEW_PK = "SELECT max( id_domainepluginlutece ) FROM dockerlutece_domaine";
    private static final String SQL_QUERY_SELECT = "SELECT id_domainepluginlutece, domaine FROM dockerlutece_domaine WHERE id_domainepluginlutece = ?";
    private static final String SQL_QUERY_INSERT = "INSERT INTO dockerlutece_domaine ( id_domainepluginlutece, domaine ) VALUES ( ?, ? ) ";
    private static final String SQL_QUERY_DELETE = "DELETE FROM dockerlutece_domaine WHERE id_domainepluginlutece = ? ";
    private static final String SQL_QUERY_UPDATE = "UPDATE dockerlutece_domaine SET id_domainepluginlutece = ?, domaine = ? WHERE id_domainepluginlutece = ?";
    private static final String SQL_QUERY_SELECTALL = "SELECT id_domainepluginlutece, domaine FROM dockerlutece_domaine";
    private static final String SQL_QUERY_SELECTALL_ID = "SELECT id_domainepluginlutece FROM dockerlutece_domaine";

    /**
     * Generates a new primary key
     * @param plugin The Plugin
     * @return The new primary key
     */
    public int newPrimaryKey( Plugin plugin)
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_NEW_PK , plugin  );
        daoUtil.executeQuery( );

        int nKey = 1;

        if( daoUtil.next( ) )
        {
                nKey = daoUtil.getInt( 1 ) + 1;
        }

        daoUtil.free();

        return nKey;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void insert( DomainePluginLutece domainePluginLutece, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_INSERT, plugin );

        domainePluginLutece.setId( newPrimaryKey( plugin ) );

        daoUtil.setInt( 1, domainePluginLutece.getId( ) );
        daoUtil.setString( 2, domainePluginLutece.getDomaine( ) );

        daoUtil.executeUpdate( );
        daoUtil.free( );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public DomainePluginLutece load( int nKey, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECT, plugin );
        daoUtil.setInt( 1 , nKey );
        daoUtil.executeQuery( );

        DomainePluginLutece domainePluginLutece = null;

        if ( daoUtil.next( ) )
        {
            domainePluginLutece = new DomainePluginLutece();
            domainePluginLutece.setId( daoUtil.getInt( 1 ) );
            domainePluginLutece.setDomaine( daoUtil.getString( 2 ) );
        }

        daoUtil.free( );
        return domainePluginLutece;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void delete( int nKey, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_DELETE, plugin );
        daoUtil.setInt( 1 , nKey );
        daoUtil.executeUpdate( );
        daoUtil.free( );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void store( DomainePluginLutece domainePluginLutece, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_UPDATE, plugin );
        
        daoUtil.setInt( 1, domainePluginLutece.getId( ) );
        daoUtil.setString( 2, domainePluginLutece.getDomaine( ) );
        daoUtil.setInt( 3, domainePluginLutece.getId( ) );

        daoUtil.executeUpdate( );
        daoUtil.free( );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Collection<DomainePluginLutece> selectDomainePluginLutecesList( Plugin plugin )
    {
        Collection<DomainePluginLutece> domainePluginLuteceList = new ArrayList<DomainePluginLutece>(  );
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECTALL, plugin );
        daoUtil.executeQuery(  );

        while ( daoUtil.next(  ) )
        {
            DomainePluginLutece domainePluginLutece = new DomainePluginLutece(  );
            
            domainePluginLutece.setId( daoUtil.getInt( 1 ) );
                domainePluginLutece.setDomaine( daoUtil.getString( 2 ) );

            domainePluginLuteceList.add( domainePluginLutece );
        }

        daoUtil.free( );
        return domainePluginLuteceList;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public Collection<Integer> selectIdDomainePluginLutecesList( Plugin plugin )
    {
            Collection<Integer> domainePluginLuteceList = new ArrayList<Integer>( );
            DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECTALL_ID, plugin );
            daoUtil.executeQuery(  );

            while ( daoUtil.next(  ) )
            {
                domainePluginLuteceList.add( daoUtil.getInt( 1 ) );
            }

            daoUtil.free( );
            return domainePluginLuteceList;
    }
}