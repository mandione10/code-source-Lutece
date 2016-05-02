INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 1, "Application");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 2, "Authentication");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 3, "Cms");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 4, "Collaboration");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 5, "Directory-form-workflow");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 6, "Extends");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 7, "Genericattibutes");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 8, "Library");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 9, "Moved");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 10, "Seo");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 11, "System");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 12, "Technical");
INSERT INTO dockerlutece_domaine (id_domainepluginlutece, domaine) VALUES ( 13, "Testrelease");

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 1, "fr.paris.lutece.plugins", "library-stock", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 2, "fr.paris.lutece.plugins", "module-billetterie-mydashboard", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 3, "fr.paris.lutece.plugins", "module-crm-formengine", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 4, "fr.paris.lutece.plugins", "module-formengine-outputdb", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 5, "fr.paris.lutece.plugins", "module-formengine-outputws", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 6, "fr.paris.lutece.plugins", "module-formengine-sample", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 7, "fr.paris.lutece.plugins", "module-stock-billetterie", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 8, "fr.paris.lutece.plugins", "module-stock-tickets", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 9, "fr.paris.lutece.plugins", "plugin-formengine", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 10, "fr.paris.lutece.plugins", "plugin-stock", 
"2.1.2-SNAPSHOT", "lutece-plugin", "Application" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 11, "fr.paris.lutece.plugins", "plugin-userban", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Application" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 12, "fr.paris.lutece.plugins", "module-myapps-database", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 13, "fr.paris.lutece.plugins", "module-myapps-wsso", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 14, "fr.paris.lutece.plugins", "module-mylutece-cas", 
"1.1.11-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 15, "fr.paris.lutece.plugins", "module-mylutece-casexternal", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 16, "fr.paris.lutece.plugins", "module-mylutece-directory", 
"2.0.7-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 17, "fr.paris.lutece.plugins", "module-mylutece-external", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 18, "fr.paris.lutece.plugins", "module-mylutece-ldapdatabase", 
"3.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 19, "fr.paris.lutece.plugins", "module-mylutece-notification", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 20, "fr.paris.lutece.plugins", "module-mylutece-openam", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 21, "fr.paris.lutece.plugins", "module-mylutece-openiddatabase", 
"2.0.8-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 22, "fr.paris.lutece.plugins", "module-mylutece-opensso", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 23, "fr.paris.lutece.plugins", "module-mylutece-parisconnect", 
"1.0.6-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 24, "fr.paris.lutece.plugins", "module-mylutece-rest", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 25, "fr.paris.lutece.plugins", "module-mylutece-webserver", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 26, "fr.paris.lutece.plugins", "plugin-adminauthenticationdatabase", 
"2.0.6-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 27, "fr.paris.lutece.plugins", "plugin-adminauthenticationwsso", 
"2.0.10-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 28, "fr.paris.lutece.plugins", "plugin-myapps", 
"2.1.3-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 29, "fr.paris.lutece.plugins", "plugin-searchldap", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 30, "fr.paris.lutece.plugins", "plugin-selfregistration", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Authentication" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 31, "fr.paris.lutece.plugins", "plugin-userws", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Authentication" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 32, "fr.paris.lutece.plugins", "module-document-export", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 33, "fr.paris.lutece.plugins", "module-document-include-opengraph", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 34, "fr.paris.lutece.plugins", "module-document-multirootindexers", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 35, "fr.paris.lutece.plugins", "module-document-rest", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 36, "fr.paris.lutece.plugins", "plugin-rating", 
"1.0.4-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 37, "fr.paris.lutece.plugins", "module-htmlpage-solr", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 38, "fr.paris.lutece.plugins", "module-jsr170-solr", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 39, "fr.paris.lutece.plugins", "module-myportal-mytasks", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 40, "fr.paris.lutece.plugins", "module-myportal-rss", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 41, "fr.paris.lutece.plugins", "module-newsletter-document", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 42, "fr.paris.lutece.plugins", "module-subscribe-mydashboard", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 43, "fr.paris.lutece.plugins", "plugin-googleapi", 
"3.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 44, "fr.paris.lutece.plugins", "plugin-greetingscard", 
"3.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 45, "fr.paris.lutece.plugins", "plugin-insertajax", 
"2.0.11-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 46, "fr.paris.lutece.plugins", "plugin-jsr168", 
"2.0.5-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 47, "fr.paris.lutece.plugins", "plugin-jsr170", 
"2.2.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 48, "fr.paris.lutece.plugins", "plugin-jsr286", 
"2.0.6-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 49, "fr.paris.lutece.plugins", "plugin-linkpages", 
"4.0.4-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 50, "fr.paris.lutece.plugins", "plugin-links", 
"2.0.9-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 51, "fr.paris.lutece.plugins", "plugin-myportal", 
"3.0.0-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 52, "fr.paris.lutece.plugins", "plugin-mytasks", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 53, "fr.paris.lutece.plugins", "plugin-pagelinkservice", 
"3.0.3-SNAPSHOT", "lutece-plugin", "Cms" );
/*INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 54, "fr.paris.lutece.plugins", "plugin-stock", 
"2.1.2-SNAPSHOT", "lutece-plugin", "Cms" );*/
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 55, "fr.paris.lutece.plugins", "plugin-webappcontainer", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 56, "fr.paris.lutece.plugins", "plugin-wrapper", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 57, "fr.paris.lutece.plugins", "plugin-xmlpage", 
"2.1.2-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 58, "fr.paris.lutece.plugins", "plugin-xpagelinkservice", 
"3.0.1-SNAPSHOT", "lutece-plugin", "Cms" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 59, "fr.paris.lutece.plugins", "plugin-xpageportlet", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Cms" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 60, "fr.paris.lutece.plugins", "module-announce-mydashboard", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 61, "fr.paris.lutece.plugins", "module-announce-solr", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 62, "fr.paris.lutece.plugins", "module-announce-workflow", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 63, "fr.paris.lutece.plugins", "module-digglike-jasper", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 64, "fr.paris.lutece.plugins", "module-digglike-solr", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 65, "fr.paris.lutece.plugins", "module-quiz-exportdirectory", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Collaboration" );
/*INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 66, "fr.paris.lutece.plugins", "module-quiz-games", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Collaboration" );*/
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 66, "fr.paris.lutece.plugins", "module-quiz-rest", 
"1.0.8-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 67, "fr.paris.lutece.plugins", "module-wiki-solr", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 68, "fr.paris.lutece.plugins", "plugin-announce", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 69, "fr.paris.lutece.plugins", "plugin-chat", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 70, "fr.paris.lutece.plugins", "plugin-digglike", 
"2.3.2-SNAPSHOT", "lutece-plugin", "Collaboration" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 71, "fr.paris.lutece.plugins", "plugin-mypage", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Collaboration" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 72, "fr.paris.lutece.plugins", "module-directory-address", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 73, "fr.paris.lutece.plugins", "module-directory-gis", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 74, "fr.paris.lutece.plugins", "module-directory-googlemaps", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 75, "fr.paris.lutece.plugins", "module-directory-solr", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 76, "fr.paris.lutece.plugins", "module-fdw-wizard", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 77, "fr.paris.lutece.plugins", "module-fdw-wizard-exportdirectory", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 78, "fr.paris.lutece.plugins", "module-fdw-wizard-pdfproducer", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 79, "fr.paris.lutece.plugins", "module-form-compare-validators", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 80, "fr.paris.lutece.plugins", "module-form-date-validators", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 81, "fr.paris.lutece.plugins", "module-form-exportdatabase", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 82, "fr.paris.lutece.plugins", "module-form-exportdirectory", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 83, "fr.paris.lutece.plugins", "module-form-include-opengraph", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 84, "fr.paris.lutece.plugins", "module-solrserver-directory", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 85, "fr.paris.lutece.plugins", "plugin-form", 
"4.1.5-SNAPSHOT", "lutece-plugin", "Directory-form-workflow" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 86, "fr.paris.lutece.plugins", "module-genericattributes-address", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Genericattibutes" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 87, "fr.paris.lutece.plugins", "module-genericattributes-gis", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Genericattibutes" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 88, "fr.paris.lutece.plugins", "module-genericattributes-googlemaps", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Genericattibutes" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 89, "fr.paris.lutece.plugins", "module-genericattributes-openstreetmap", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Genericattibutes" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 90, "fr.paris.lutece.plugins", "library-analyzer", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 91, "fr.paris.lutece.plugins", "library-archive", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 92, "fr.paris.lutece.plugins", "library-blobstore", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 93, "fr.paris.lutece.plugins", "library-documentclient", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 94, "fr.paris.lutece.plugins", "library-freemarker", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 95, "fr.paris.lutece.plugins", "library-guice", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 96, "fr.paris.lutece.plugins", "library-image", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 97, "fr.paris.lutece.plugins", "library-indexer", 
"2.0.11-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 98, "fr.paris.lutece.plugins", "library-jmx-api", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 99, "fr.paris.lutece.plugins", "library-jsr286-pluto", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 100, "fr.paris.lutece.plugins", "library-lutece-unit-testing", 
"2.0.9-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 101, "fr.paris.lutece.plugins", "library-mvc", 
"1.3.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 102, "fr.paris.lutece.plugins", "library-providercustomer", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 103, "fr.paris.lutece.plugins", "library-rbac-api", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 104, "fr.paris.lutece.plugins", "library-rss", 
"1.0.4-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 105, "fr.paris.lutece.plugins", "library-spagobiclient", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 106, "fr.paris.lutece.plugins", "library-updater", 
"1.0.6-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 107, "fr.paris.lutece.plugins", "library-updatercli", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 108, "fr.paris.lutece.plugins", "library-workflow-core", 
"1.2.0-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 109, "fr.paris.lutece.plugins", "library-workflow-notify", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 110, "fr.paris.lutece.plugins", "library-workgroup-api", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Library" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 111, "fr.paris.lutece.plugins", "library-crmclient", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 112, "fr.paris.lutece.plugins", "library-httpaccess", 
"2.4.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 113, "fr.paris.lutece.plugins", "library-lucene", 
"2.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 114, "fr.paris.lutece.plugins", "library-signrequest", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 115, "fr.paris.lutece.plugins", "module-appointment-mydashboard", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 116, "fr.paris.lutece.plugins", "module-appointment-resource", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 117, "fr.paris.lutece.plugins", "module-calendar-document", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 118, "fr.paris.lutece.plugins", "module-calendar-solr", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 119, "fr.paris.lutece.plugins", "module-captcha-jcaptcha", 
"2.1.13-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 120, "fr.paris.lutece.plugins", "module-crm-form", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 121, "fr.paris.lutece.plugins", "module-crm-mylutece", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 122, "fr.paris.lutece.plugins", "module-crm-mylutecedatabase", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 123, "fr.paris.lutece.plugins", "module-crm-mylutecedirectory", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 124, "fr.paris.lutece.plugins", "module-crm-rest", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 125, "fr.paris.lutece.plugins", "module-dbpage-jasper", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 126, "fr.paris.lutece.plugins", "module-dila-solr", 
"1.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 127, "fr.paris.lutece.plugins", "module-directory-pdfproducer", 
"1.2.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 128, "fr.paris.lutece.plugins", "module-directory-pdfproducer-archive", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 129, "fr.paris.lutece.plugins", "module-directory-rest", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
/*INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 130, "fr.paris.lutece.plugins", "module-document-rest", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );*/
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 131, "fr.paris.lutece.plugins", "module-document-cmis", 
"1.2.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 132, "fr.paris.lutece.plugins", "module-document-solr", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 133, "fr.paris.lutece.plugins", "module-documenttocalendar", 
"1.2.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 134, "fr.paris.lutece.plugins", "module-document-ckan", 
"1.3.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 135, "fr.paris.lutece.plugins", "module-extend-actionbar", 
"1.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 136, "fr.paris.lutece.plugins", "module-extend-actionhit", 
"1.0.4-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 137, "fr.paris.lutece.plugins", "module-extend-comment", 
"1.1.8-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 138, "fr.paris.lutece.plugins", "module-extend-comment-extendable", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 139, "fr.paris.lutece.plugins", "module-extend-feedback", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 140, "fr.paris.lutece.plugins", "module-extend-opengraph", 
"1.2.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 141, "fr.paris.lutece.plugins", "module-extend-rating", 
"1.1.7-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 142, "fr.paris.lutece.plugins", "module-extend-statistics", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 143, "fr.paris.lutece.plugins", "module-helpdesk-solr", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 144, "fr.paris.lutece.plugins", "module-mydashboard-avatar", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 145, "fr.paris.lutece.plugins", "module-mydashboard-mylutecedatabase", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 146, "fr.paris.lutece.plugins", "module-mylutece-database", 
"4.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 147, "fr.paris.lutece.plugins", "module-mylutece-oauth", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 148, "fr.paris.lutece.plugins", "module-mylutece-openid", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 149, "fr.paris.lutece.plugins", "module-mylutece-persona", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 150, "fr.paris.lutece.plugins", "module-mylutece-saml", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 151, "fr.paris.lutece.plugins", "module-mylutece-websso", 
"1.1.0-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 152, "fr.paris.lutece.plugins", "module-mylutece-wssodatabase", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 153, "fr.paris.lutece.plugins", "module-seo-crm", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 154, "fr.paris.lutece.plugins", "module-seo-digglike", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 155, "fr.paris.lutece.plugins", "module-seo-document", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 156, "fr.paris.lutece.plugins", "module-seo-robots", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 157, "fr.paris.lutece.plugins", "module-seo-wiki", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 158, "fr.paris.lutece.plugins", "module-unittree-profiles", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 159, "fr.paris.lutece.plugins", "module-workflow-alert", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 160, "fr.paris.lutece.plugins", "module-workflow-appointment", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 161, "fr.paris.lutece.plugins", "module-workflow-archive", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 162, "fr.paris.lutece.plugins", "module-workflow-automatic-assignment", 
"2.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 163, "fr.paris.lutece.plugins", "module-workflow-createpdf", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 164, "fr.paris.lutece.plugins", "module-workflow-editrecord", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 165, "fr.paris.lutece.plugins", "module-workflow-evaluation", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 166, "fr.paris.lutece.plugins", "module-workflow-fillingdirectory", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 167, "fr.paris.lutece.plugins", "module-workflow-formincrement", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 168, "fr.paris.lutece.plugins", "module-workflow-mappings", 
"2.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 169, "fr.paris.lutece.plugins", "module-workflow-mylutece-validation", 
"2.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 170, "fr.paris.lutece.plugins", "module-workflow-notifycrm", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 171, "fr.paris.lutece.plugins", "module-workflow-notifydirectory", 
"4.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 172, "fr.paris.lutece.plugins", "module-workflow-notifymylutece", 
"3.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 173, "fr.paris.lutece.plugins", "module-workflow-previewnotification", 
"2.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 174, "fr.paris.lutece.plugins", "module-workflow-reassignment", 
"3.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 175, "fr.paris.lutece.plugins", "module-workflow-rest", 
"2.0.4-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 176, "fr.paris.lutece.plugins", "plugin-appointment", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 177, "fr.paris.lutece.plugins", "plugin-appstore", 
"1.2.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 178, "fr.paris.lutece.plugins", "plugin-avatar", 
"1.3.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 179, "fr.paris.lutece.plugins", "plugin-avatarserver", 
"1.2.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 180, "fr.paris.lutece.plugins", "plugin-calendar", 
"4.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 181, "fr.paris.lutece.plugins", "plugin-captcha", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 182, "fr.paris.lutece.plugins", "plugin-childpages", 
"4.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 183, "fr.paris.lutece.plugins", "plugin-codewizard", 
"4.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 184, "fr.paris.lutece.plugins", "plugin-contact", 
"4.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 185, "fr.paris.lutece.plugins", "plugin-contextinclude", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 186, "fr.paris.lutece.plugins", "plugin-crm", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 187, "fr.paris.lutece.plugins", "plugin-crmclient", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 188, "fr.paris.lutece.plugins", "plugin-dataviz", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 189, "fr.paris.lutece.plugins", "plugin-dbpage", 
"3.0.0-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 190, "fr.paris.lutece.plugins", "plugin-dila", 
"1.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 191, "fr.paris.lutece.plugins", "plugin-directory", 
"4.0.7-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 192, "fr.paris.lutece.plugins", "plugin-document", 
"4.0.7-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 193, "fr.paris.lutece.plugins", "plugin-elasticsearch", 
"0.9.0-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 194, "fr.paris.lutece.plugins", "plugin-extend", 
"1.3.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 195, "fr.paris.lutece.plugins", "plugin-files2docs", 
"1.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 196, "fr.paris.lutece.plugins", "plugin-folderlisting", 
"2.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 197, "fr.paris.lutece.plugins", "plugin-genericattributes", 
"1.1.5-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 198, "fr.paris.lutece.plugins", "plugin-gis", 
"2.2.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 199, "fr.paris.lutece.plugins", "plugin-graphite", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 200, "fr.paris.lutece.plugins", "plugin-gtools", 
"1.2.5-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 201, "fr.paris.lutece.plugins", "plugin-helpdesk", 
"3.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 202, "fr.paris.lutece.plugins", "plugin-html", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 203, "fr.paris.lutece.plugins", "plugin-htmlpage", 
"4.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 204, "fr.paris.lutece.plugins", "plugin-insertalbum", 
"1.2.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 205, "fr.paris.lutece.plugins", "plugin-insertmap", 
"1.2.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 206, "fr.paris.lutece.plugins", "plugin-jasper", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 207, "fr.paris.lutece.plugins", "plugin-jmx", 
"0.9.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 208, "fr.paris.lutece.plugins", "plugin-jmxtrans", 
"0.9.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 209, "fr.paris.lutece.plugins", "plugin-kibana", 
"0.9.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 210, "fr.paris.lutece.plugins", "plugin-library", 
"4.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 211, "fr.paris.lutece.plugins", "plugin-menus", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 212, "fr.paris.lutece.plugins", "plugin-multimedia", 
"0.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 213, "fr.paris.lutece.plugins", "plugin-mydashboard", 
"plugin-mydashboard", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 214, "fr.paris.lutece.plugins", "plugin-mylutece", 
"3.3.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 215, "fr.paris.lutece.plugins", "plugin-mylutecetest", 
"3.2.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 226, "fr.paris.lutece.plugins", "plugin-newsletter", 
"4.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 227, "fr.paris.lutece.plugins", "plugin-paybox", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 228, "fr.paris.lutece.plugins", "plugin-phraseanet", 
"1.2.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 229, "fr.paris.lutece.plugins", "plugin-pluginwizard", 
"4.1.1", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 230, "fr.paris.lutece.plugins", "plugin-profiles", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 231, "fr.paris.lutece.plugins", "plugin-quicklinks", 
"3.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 232, "fr.paris.lutece.plugins", "plugin-quiz", 
"2.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 233, "fr.paris.lutece.plugins", "plugin-recommendation", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 234, "fr.paris.lutece.plugins", "plugin-rest", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 235, "fr.paris.lutece.plugins", "plugin-rss", 
"4.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 236, "fr.paris.lutece.plugins", "plugin-searchstats", 
"4.3.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 237, "fr.paris.lutece.plugins", "plugin-seo", 
"3.2.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 238, "fr.paris.lutece.plugins", "plugin-shoppingcart", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 239, "fr.paris.lutece.plugins", "plugin-sitelabels", 
"1.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 240, "fr.paris.lutece.plugins", "plugin-solr", 
"3.0.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 241, "fr.paris.lutece.plugins", "plugin-solrserver", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 242, "fr.paris.lutece.plugins", "plugin-sponsoredlinks", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 243, "fr.paris.lutece.plugins", "plugin-subscribe", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 244, "fr.paris.lutece.plugins", "plugin-systeminfo", 
"3.1.3-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 245, "fr.paris.lutece.plugins", "plugin-tagcloud", 
"4.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 246, "fr.paris.lutece.plugins", "plugin-theme", 
"4.1.2-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 247, "fr.paris.lutece.plugins", "plugin-unittree", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 248, "fr.paris.lutece.plugins", "plugin-updater", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 249, "fr.paris.lutece.plugins", "plugin-upload", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 250, "fr.paris.lutece.plugins", "plugin-whatsnew", 
"3.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 251, "fr.paris.lutece.plugins", "plugin-wiki", 
"2.1.1-SNAPSHOT", "lutece-plugin", "Moved" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 252, "fr.paris.lutece.plugins", "plugin-workflow", 
"4.2.3-SNAPSHOT", "lutece-plugin", "Moved" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 253, "fr.paris.lutece.plugins", "plugin-sitemap", 
"1.1.4-SNAPSHOT", "lutece-plugin", "Seo" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 254, "fr.paris.lutece.plugins", "plugin-urlrewriter", 
"1.1.4-SNAPSHOT", "lutece-plugin", "Seo" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 255, "fr.paris.lutece.plugins", "plugin-urlrewriteradmin", 
"1.2.1-SNAPSHOT", "lutece-plugin", "Seo" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 256, "fr.paris.lutece.plugins", "module-urlrewriteradmin-document", 
"1.0.1-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 257, "fr.paris.lutece.plugins", "plugin-antexecuter", 
"1.0.0-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 258, "fr.paris.lutece.plugins", "plugin-disconnection", 
"1.0.3-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 259, "fr.paris.lutece.plugins", "plugin-hipolite", 
"3.0.1-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 260, "fr.paris.lutece.plugins", "plugin-shorturl", 
"1.0.3-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 261, "fr.paris.lutece.plugins", "plugin-updatercatalog", 
"2.3.0-SNAPSHOT", "lutece-plugin", "System" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 262, "fr.paris.lutece.plugins", "plugin-wurfl", 
"1.0.1-SNAPSHOT", "lutece-plugin", "System" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 263, "fr.paris.lutece.plugins", "module-address-autocomplete", 
"1.0.4-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 264, "fr.paris.lutece.plugins", "module-archive-rest", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 265, "fr.paris.lutece.plugins", "module-blobstore-rest", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 266, "fr.paris.lutece.plugins", "module-comarquage-solr", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 267, "fr.paris.lutece.plugins", "module-formengine-gis", 
"1.0.3-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 268, "fr.paris.lutece.plugins", "module-gis-address", 
"1.0.2-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 269, "fr.paris.lutece.plugins", "module-html-rest", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 270, "fr.paris.lutece.plugins", "module-jpa-hibernate", 
"1.0.7-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 271, "fr.paris.lutece.plugins", "module-resource-adminuser", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 272, "fr.paris.lutece.plugins", "module-resource-extendableresource", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 273, "fr.paris.lutece.plugins", "module-resource-mylutece", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 274, "fr.paris.lutece.plugins", "module-workflow-deployment", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 275, "fr.paris.lutece.plugins", "plugin-address", 
"1.0.7-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 276, "fr.paris.lutece.plugins", "plugin-adminquery", 
"2.1.2-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 277, "fr.paris.lutece.plugins", "plugin-adminsql", 
"2.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 278, "fr.paris.lutece.plugins", "plugin-archive", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 279, "fr.paris.lutece.plugins", "plugin-archive-client", 
"1.0.5-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 280, "fr.paris.lutece.plugins", "plugin-blobstore", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 281, "fr.paris.lutece.plugins", "plugin-blobstoreclient", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 282, "fr.paris.lutece.plugins", "plugin-bootstrap2compatibility", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 283, "fr.paris.lutece.plugins", "plugin-comarquage", 
"2.0.9-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 284, "fr.paris.lutece.plugins", "plugin-deployment", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 285, "fr.paris.lutece.plugins", "plugin-ganalytics", 
"1.0.0-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 286, "fr.paris.lutece.plugins", "plugin-importexport", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 287, "fr.paris.lutece.plugins", "plugin-limitconnectedusers", 
"1.1.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 288, "fr.paris.lutece.plugins", "plugin-parisvideo", 
"0.0.5-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 289, "fr.paris.lutece.plugins", "plugin-portalrest", 
"2.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 290, "fr.paris.lutece.plugins", "plugin-regularexpression", 
"3.0.4-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 291, "fr.paris.lutece.plugins", "plugin-resource", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 292, "fr.paris.lutece.plugins", "plugin-solr-nutch", 
"1.0.1-SNAPSHOT", "lutece-plugin", "Technical" );

INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 293, "fr.paris.lutece.plugins", "module-testrelease", 
"0.1.9-SNAPSHOT", "lutece-plugin", "Testrelease" );
INSERT INTO dockerlutece_plugin ( id_pluginlutece, group_id, artifact_id, version, type, domaine ) VALUES ( 294, "fr.paris.lutece.plugins", "plugin-testrelease", 
"1.6.21-SNAPSHOT", "lutece-plugin", "Testrelease" );
