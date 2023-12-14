CREATE DATABASE transac; 
USE transac; 

CREATE table utilisateur(
id INT PRIMARY KEY AUTO_INCREMENT,
nom VARCHAR(50),
prenom VARCHAR(50),
age INT
);

CREATE TABLE commande(
id INT AUTO_INCREMENT PRIMARY KEY,
utilisateur_id INT, 
produit VARCHAR(50), 
quantite INT,
FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id) 
);

INSERT INTO utilisateur (nom, prenom, age)
VALUES
("Sandra", "Nycouvertur", FLOOR(RAND()*50)+18),
("Vincent", "Tim", FLOOR(RAND()*50)+18),
("Sasha", "Touille", FLOOR(RAND()*50)+18);

SELECT * FROM utilisateur;

INSERT INTO commande (utilisateur_id, produit, quantite)
VALUES
(1,"Parure de lit", FLOOR(RAND()*5)+1),
(2,"Cadre 50x50", FLOOR(RAND()*5)+1),
(3,"Plaid", FLOOR(RAND()*5)+1),
(2,"Bols céramique bleu", FLOOR(RAND()*5)+1),
(1,"Banc coffre", FLOOR(RAND()*5)+1);

SELECT *From commande;

-- Début de la transaction
-- BEGIN 
 START TRANSACTION; 
 
 -- Inserer un nouvel utilisateur 
 INSERT INTO utilisateur (nom, prenom, age)
 VALUES 
 ('Thomas', 'Toquet-Cheuppe', FLOOR(RAND()*50)+18);
 
 -- Recup du dernier id utilisateur insere
 SET @utilisateur_id = last_insert_id();
 
 INSERT INTO commande (utilisateur_id, produit, quantite)
 VALUES
 (@utilisateur_id, "Chauffe épaule", FLOOR(RAND()*5)+1);
 
 -- Valider ma transaction 
 COMMIT;
 
 -- Début de la transaction
BEGIN; 
 -- START TRANSACTION; 
 
 -- Inserer un nouvel utilisateur 
 INSERT INTO utilisateur (nom, prenom, age)
 VALUES 
 ('Tricia', 'Colere', FLOOR(RAND()*50)+18);
 
 -- Recup du dernier id utilisateur insere
 SET @utilisateur_id = last_insert_id();
 
 INSERT INTO commande (utilisateur_id, produit, quantite)
 VALUES
 (@utilisateur_id, "Miroir", FLOOR(RAND()*5)+1);
 
 -- Annuler ma transaction 
ROLLBACK;
 
 
