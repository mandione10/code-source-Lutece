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
 * This class provides Data Access methods for PluginLutece objects
 */

public final class PluginLuteceDAO implements IPluginLuteceDAO
{
    // Constants
    private static final String SQL_QUERY_NEW_PK = "SELECT max( id_pluginlutece ) FROM dockerlutece_plugin";
    private static final String SQL_QUERY_SELECT = "SELECT id_pluginlutece, group_id, artifact_id, version, type, domaine FROM dockerlutece_plugin WHERE id_pluginlutece = ?";
    private static final String SQL_QUERY_INSERT = "INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( ?, ?, ?, ?, ?, ? ) ";
    private static final String SQL_QUERY_DELETE = "DELETE FROM dockerlutece_plugin WHERE id_pluginlutece = ? ";
    private static final String SQL_QUERY_UPDATE = "UPDATE dockerlutece_plugin SET id_pluginlutece = ?, group_id = ?, artifact_id = ?, version = ?, type = ?, domaine = ? WHERE id_pluginlutece = ?";
    private static final String SQL_QUERY_SELECTALL = "SELECT id_pluginlutece, group_id, artifact_id, version, type, domaine FROM dockerlutece_plugin";
    private static final String SQL_QUERY_SELECTALL_ID = "SELECT id_pluginlutece FROM dockerlutece_plugin";

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
    public void insert( PluginLutece pluginLutece, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_INSERT, plugin );

        pluginLutece.setId( newPrimaryKey( plugin ) );

        daoUtil.setInt( 1, pluginLutece.getId( ) );
        daoUtil.setString( 2, pluginLutece.getGroupId( ) );
        daoUtil.setString( 3, pluginLutece.getArtifactId( ) );
        daoUtil.setString( 4, pluginLutece.getVersion( ) );
        daoUtil.setString( 5, pluginLutece.getType( ) );
        daoUtil.setString( 6, pluginLutece.getDomaine( ) );

        daoUtil.executeUpdate( );
        daoUtil.free( );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public PluginLutece load( int nKey, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECT, plugin );
        daoUtil.setInt( 1 , nKey );
        daoUtil.executeQuery( );

        PluginLutece pluginLutece = null;

        if ( daoUtil.next( ) )
        {
            pluginLutece = new PluginLutece();
            pluginLutece.setId( daoUtil.getInt( 1 ) );
            pluginLutece.setGroupId( daoUtil.getString( 2 ) );
            pluginLutece.setArtifactId( daoUtil.getString( 3 ) );
            pluginLutece.setVersion( daoUtil.getString( 4 ) );
            pluginLutece.setType( daoUtil.getString( 5 ) );
            pluginLutece.setDomaine( daoUtil.getString( 6 ) );
        }

        daoUtil.free( );
        return pluginLutece;
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
    public void store( PluginLutece pluginLutece, Plugin plugin )
    {
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_UPDATE, plugin );
        
        daoUtil.setInt( 1, pluginLutece.getId( ) );
        daoUtil.setString( 2, pluginLutece.getGroupId( ) );
        daoUtil.setString( 3, pluginLutece.getArtifactId( ) );
        daoUtil.setString( 4, pluginLutece.getVersion( ) );
        daoUtil.setString( 5, pluginLutece.getType( ) );
        daoUtil.setString( 6, pluginLutece.getDomaine( ) );
        daoUtil.setInt( 7, pluginLutece.getId( ) );

        daoUtil.executeUpdate( );
        daoUtil.free( );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public Collection<PluginLutece> selectPluginLutecesList( Plugin plugin )
    {
        Collection<PluginLutece> pluginLuteceList = new ArrayList<PluginLutece>(  );
        DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECTALL, plugin );
        daoUtil.executeQuery(  );

        while ( daoUtil.next(  ) )
        {
            PluginLutece pluginLutece = new PluginLutece(  );
            
            pluginLutece.setId( daoUtil.getInt( 1 ) );
                pluginLutece.setGroupId( daoUtil.getString( 2 ) );
                pluginLutece.setArtifactId( daoUtil.getString( 3 ) );
                pluginLutece.setVersion( daoUtil.getString( 4 ) );
                pluginLutece.setType( daoUtil.getString( 5 ) );
                pluginLutece.setDomaine( daoUtil.getString( 6 ) );

            pluginLuteceList.add( pluginLutece );
        }

        daoUtil.free( );
        return pluginLuteceList;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public Collection<Integer> selectIdPluginLutecesList( Plugin plugin )
    {
            Collection<Integer> pluginLuteceList = new ArrayList<Integer>( );
            DAOUtil daoUtil = new DAOUtil( SQL_QUERY_SELECTALL_ID, plugin );
            daoUtil.executeQuery(  );

            while ( daoUtil.next(  ) )
            {
                pluginLuteceList.add( daoUtil.getInt( 1 ) );
            }

            daoUtil.free( );
            return pluginLuteceList;
    }
}