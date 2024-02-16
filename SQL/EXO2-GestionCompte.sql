CREATE DATABASE gestion_de_compte; 
USE gestion_de_compte;

CREATE TABLE IF NOT EXISTS compte(
compte_id INT AUTO_INCREMENT PRIMARY KEY,
compte_pseudo VARCHAR(50), 
compte_password VARCHAR(50),
compte_email VARCHAR(255), 
compte_date_creation DATETIME, 
compte_dernière_connexion VARCHAR(50)
); 

CREATE TABLE IF NOT EXISTS roles(
roles_id INT AUTO_INCREMENT PRIMARY KEY, 
libelle VARCHAR(50)
); 

CREATE TABLE IF NOT EXISTS compte_role(
compte_id INT,
roles_id INT, 
date_ajout DATETIME, 
PRIMARY KEY (compte_id, roles_id),
CONSTRAINT fk_compte_id FOREIGN KEY (compte_id) REFERENCES compte(compte_id),
CONSTRAINT fk_roles_id FOREIGN KEY (roles_id) REFERENCES roles(roles_id)
); 