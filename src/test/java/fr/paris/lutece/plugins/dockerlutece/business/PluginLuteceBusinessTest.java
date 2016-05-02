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

package fr.paris.lutece.plugins.dockerlutece.business;

import fr.paris.lutece.test.LuteceTestCase;


public class PluginLuteceBusinessTest extends LuteceTestCase
{
    private final static String GROUPID1 = "GroupId1";
    private final static String GROUPID2 = "GroupId2";
    private final static String ARTIFACTID1 = "ArtifactId1";
    private final static String ARTIFACTID2 = "ArtifactId2";
    private final static String VERSION1 = "Version1";
    private final static String VERSION2 = "Version2";
    private final static String DOMAINE1 = "Domaine1";
    private final static String DOMAINE2 = "Domaine2";

    public void testBusiness(  )
    {
        // Initialize an object
        PluginLutece pluginLutece = new PluginLutece();
        pluginLutece.setGroupId( GROUPID1 );
        pluginLutece.setArtifactId( ARTIFACTID1 );
        pluginLutece.setVersion( VERSION1 );
        pluginLutece.setDomaine( DOMAINE1 );

        // Create test
        PluginLuteceHome.create( pluginLutece );
        PluginLutece pluginLuteceStored = PluginLuteceHome.findByPrimaryKey( pluginLutece.getId( ) );
        assertEquals( pluginLuteceStored.getGroupId() , pluginLutece.getGroupId( ) );
        assertEquals( pluginLuteceStored.getArtifactId() , pluginLutece.getArtifactId( ) );
        assertEquals( pluginLuteceStored.getVersion() , pluginLutece.getVersion( ) );
        assertEquals( pluginLuteceStored.getDomaine() , pluginLutece.getDomaine( ) );

        // Update test
        pluginLutece.setGroupId( GROUPID2 );
        pluginLutece.setArtifactId( ARTIFACTID2 );
        pluginLutece.setVersion( VERSION2 );
        pluginLutece.setDomaine( DOMAINE2 );
        PluginLuteceHome.update( pluginLutece );
        pluginLuteceStored = PluginLuteceHome.findByPrimaryKey( pluginLutece.getId( ) );
        assertEquals( pluginLuteceStored.getGroupId() , pluginLutece.getGroupId( ) );
        assertEquals( pluginLuteceStored.getArtifactId() , pluginLutece.getArtifactId( ) );
        assertEquals( pluginLuteceStored.getVersion() , pluginLutece.getVersion( ) );
        assertEquals( pluginLuteceStored.getDomaine() , pluginLutece.getDomaine( ) );

        // List test
        PluginLuteceHome.getPluginLutecesList();

        // Delete test
        PluginLuteceHome.remove( pluginLutece.getId( ) );
        pluginLuteceStored = PluginLuteceHome.findByPrimaryKey( pluginLutece.getId( ) );
        assertNull( pluginLuteceStored );
        
    }

}