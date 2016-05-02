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

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;


/**
 * This is the business class for the object PluginLutece
 */ 
public class PluginLutece
{
    // Variables declarations 
    private int _nId;
    
    @NotEmpty( message = "#i18n{dockerlutece.validation.pluginlutece.GroupId.notEmpty}" )
    @Size( max = 50 , message = "#i18n{dockerlutece.validation.pluginlutece.GroupId.size}" ) 
    private String _strGroupId;
    
    @NotEmpty( message = "#i18n{dockerlutece.validation.pluginlutece.ArtifactId.notEmpty}" )
    @Size( max = 50 , message = "#i18n{dockerlutece.validation.pluginlutece.ArtifactId.size}" ) 
    private String _strArtifactId;
    
    @NotEmpty( message = "#i18n{dockerlutece.validation.pluginlutece.Version.notEmpty}" )
    @Size( max = 50 , message = "#i18n{dockerlutece.validation.pluginlutece.Version.size}" ) 
    private String _strVersion;
    
    @NotEmpty( message = "#i18n{dockerlutece.validation.pluginlutece.Type.notEmpty}" )
    @Size( max = 50 , message = "#i18n{dockerlutece.validation.pluginlutece.Type.size}" ) 
    private String _strType;
    
    @NotEmpty( message = "#i18n{dockerlutece.validation.pluginlutece.Domaine.notEmpty}" )
    @Size( max = 50 , message = "#i18n{dockerlutece.validation.pluginlutece.Domaine.size}" ) 
    private String _strDomaine;

    /**
     * Returns the Id
     * @return The Id
     */
    public int getId( )
    {
        return _nId;
    }

    /**
     * Sets the Id
     * @param nId The Id
     */ 
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the GroupId
     * @return The GroupId
     */
    public String getGroupId( )
    {
        return _strGroupId;
    }

    /**
     * Sets the GroupId
     * @param strGroupId The GroupId
     */ 
    public void setGroupId( String strGroupId )
    {
        _strGroupId = strGroupId;
    }
    /**
     * Returns the ArtifactId
     * @return The ArtifactId
     */
    public String getArtifactId( )
    {
        return _strArtifactId;
    }

    /**
     * Sets the ArtifactId
     * @param strArtifactId The ArtifactId
     */ 
    public void setArtifactId( String strArtifactId )
    {
        _strArtifactId = strArtifactId;
    }
    /**
     * Returns the Version
     * @return The Version
     */
    public String getVersion( )
    {
        return _strVersion;
    }    
    /**
     * Sets the Version
     * @param strVersion The Version
     */ 
    public void setVersion( String strVersion )
    {
        _strVersion = strVersion;
    }
    /**
     * Returns the Type
     * @return The Type
     */
    public String getType( )
    {
        return _strType;
    }    
    /**
     * Sets the Type
     * @param strType The Version
     */ 
    public void setType( String strType )
    {
        _strType = strType;
    }
    /**
     * Returns the Domaine
     * @return The Domaine
     */
    public String getDomaine( )
    {
        return _strDomaine;
    }

    /**
     * Sets the Domaine
     * @param strDomaine The Domaine
     */ 
    public void setDomaine( String strDomaine )
    {
        _strDomaine = strDomaine;
    }
}
