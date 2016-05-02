
--
-- Structure for table dockerlutece_plugin
--

DROP TABLE IF EXISTS dockerlutece_plugin;
CREATE TABLE dockerlutece_plugin (
id_pluginlutece int(6) NOT NULL,
group_id varchar(50) NOT NULL default '',
artifact_id varchar(50) NOT NULL default '',
version varchar(50) NOT NULL default '',
type varchar(50) NOT NULL default '',
domaine varchar(50) NOT NULL default '',
PRIMARY KEY (id_pluginlutece),
UNIQUE (artifact_id)
);

--
-- Structure for table dockerlutece_domaine
--

DROP TABLE IF EXISTS dockerlutece_domaine;
CREATE TABLE dockerlutece_domaine (
id_domainepluginlutece int(6) NOT NULL,
domaine varchar(50) NOT NULL default '',
PRIMARY KEY (id_domainepluginlutece),
UNIQUE (domaine)
);
