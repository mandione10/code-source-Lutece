
--
-- Data for table core_admin_right
--
DELETE FROM core_admin_right WHERE id_right = 'DOCKERLUTECE_MANAGEMENT';
INSERT INTO core_admin_right (id_right,name,level_right,admin_url,description,is_updatable,plugin_name,id_feature_group,icon_url,documentation_url, id_order ) VALUES 
('DOCKERLUTECE_MANAGEMENT','dockerlutece.adminFeature.ManagePluginDockerlutece.name',1,'jsp/admin/plugins/dockerlutece/ManagePluginLuteces.jsp','dockerlutece.adminFeature.ManagePluginDockerlutece.description',0,'dockerlutece',NULL,NULL,NULL,4);


--
-- Data for table core_user_right
--
DELETE FROM core_user_right WHERE id_right = 'DOCKERLUTECE_MANAGEMENT';
INSERT INTO core_user_right (id_right,id_user) VALUES ('DOCKERLUTECE_MANAGEMENT',1);


--
-- Data for table core_admin_right
--
DELETE FROM core_admin_right WHERE id_right = 'DOCKERLUTECE_MANAGEMENT';
INSERT INTO core_admin_right (id_right,name,level_right,admin_url,description,is_updatable,plugin_name,id_feature_group,icon_url,documentation_url, id_order ) VALUES 
('DOCKERLUTECE_MANAGEMENT','dockerlutece.adminFeature.ManageDomaineDockerlutece.name',1,'jsp/admin/plugins/dockerlutece/ManageDomainePluginLuteces.jsp','dockerlutece.adminFeature.ManageDomaineDockerlutece.description',0,'dockerlutece',NULL,NULL,NULL,4);


--
-- Data for table core_user_right
--
DELETE FROM core_user_right WHERE id_right = 'DOCKERLUTECE_MANAGEMENT';
INSERT INTO core_user_right (id_right,id_user) VALUES ('DOCKERLUTECE_MANAGEMENT',1);

