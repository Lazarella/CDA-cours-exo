CREATE DATABASE IF NOT EXISTS exo_annuaire; 
-- Drop DATABASE exo_annuaire; 
USE exo_annuaire; 

CREATE TABLE IF NOT EXISTS personne(
personne_id INT AUTO_INCREMENT PRIMARY KEY,
titre_personne VARCHAR(3),
prenom VARCHAR(50), 
nom VARCHAR(50),
telephone VARCHAR(10),
email VARCHAR(30)
-- adresse_id INT NOT NULL,
-- PRIMARY KEY(personne_id) 
);

CREATE TABLE IF NOT EXISTS adresse(
adresse_id INT AUTO_INCREMENT PRIMARY KEY, 
rue VARCHAR(50), 
ville VARCHAR(50),
code_postal VARCHAR(50),
personne_id INT,
CONSTRAINT fk_personne_id FOREIGN KEY (personne_id) REFERENCES personne(personne_id)
);

INSERT INTO personne
(titre_personne, prenom, nom, telephone, email)
VALUES 
('Mme','Sarah','Conor','0123456789','sarah.conor@gmail.com'),
('Mr','John','Conor','0123456789','john.cono@proton.com'),
('Mr', '003', 'TERMINATOR', '0412345678', 'terminator69@hotmail.fr');  

INSERT INTO adresse
(rue, ville, code_postal, personne_id)
VALUES
('Jean sans Peur', 'Lille','59000', 3),
('Coeur Joyeux', 'Lomme','59000', 2),
('Enfer', 'Lomme', '59000',2); 

SELECT * FROM adresse; 
SELECT *FROM personne;  

DELETE FROM adresse WHERE personne_id = 3; 

DELETE FROM personne WHERE prenom = 'toto';

DELETE FROM adresse WHERE personne_id = 6;  
DELETE FROM personne WHERE prenom = '003';

UPDATE 
personne
SET
telephone = '0666666666' 
WHERE 
nom = 'Conor'; 







