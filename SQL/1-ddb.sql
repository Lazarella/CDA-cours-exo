-- Création base de données
CREATE DATABASE IF NOT EXISTS ebtreprise_demo; 
CREATE DATABASE If NOT EXISTS entreprise_demo
CHARACTER SET = 'utf8mb4'
COLLATE = 'utf8mb4_general_ci'; 

SHOW DATABASES; 
DROP DATABASE IF EXISTS ebtreprise_demo; 

ALTER DATABASE entreprise_demo CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci; 
ALTER DATABASE  entreprise_demo DEFAULT CHARACTER SET utf8mb4; 
ALTER DATABASE entreprise_demo ENCRYPTION='Y'; 

SELECT * FROM Information_schema.SCHEMATA; 
USE entreprise_demo; 
DROP DATABASE entreprise_demo;
 
CREATE DATABASE If NOT EXISTS entreprise_demo;
USE entreprise_demo; 
/************************
Manipulation des tables
************************/
-- Création d'une seconde table 

CREATE TABLE IF NOT EXISTS service(
service_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
libelle VARCHAR(150) NOT NULL
);

-- Création d'une table si elle n'existe pas

CREATE TABLE IF NOT EXISTS salarie(
salarie_id INT NOT NULL AUTO_INCREMENT ,  -- Clé primaire qui s'auto-Incrémente
prenom VARCHAR(50) NOT NULL, -- OBLIGATION de fournir une valeur
non VARCHAR(50) NOT NULL, 
age INT NOT NULL CHECK(age > 18 AND age < 65),  -- Contrainte pour vérifier l'âge
salaire FLOAT NOT NULL DEFAULT 1500, -- Valeur par défaut 
service_id INT NOT NUll, -- Ajout de la colonne pour la clé étrangère
PRIMARY KEY(salarie_id), 
CONSTRAINT fk_service_id FOREIGN KEY (service_id) REFERENCEs service(service_id)
);

-- Supression de la table 

DROP TABLE IF EXISTS salarie; 

-- AFFICHER les tables
SHOW TABLES; 

-- Afficher le détail des colonnes 
SHOW COLUMNS FROM salarie; 
SHOW COLUMNS FROM service;

-- Ajout de la contrainte après la création de la table 
ALTER TABLE salarie
	ADD CONSTRAINT fk_service_id FOREIGN KEY(service_id) REFERENCES service(service_id);
    
-- Ajouter une colonne date et heure

ALTER TABLE service
	ADD COLUMN date_modification DATETIME; 
    
-- Modifier la colonne en type DATE 
ALTER TABLE service
	MODIFY COLUMN date_modification DATE; 
    
