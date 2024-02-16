CREATE DATABASE jointure; 
USE jointure; 

CREATE TABLE utilisateur(
id INT PRIMARY KEY AUTO_INCREMENT,
prenom VARCHAR(50) NOT NULL,
nom VARCHAR(50),
email VARCHAR(50),
vill VARCHAR(50), 
actif INT 
);

CREATE TABLE commande(
utilisateur_id INT, 
date_achat DATE,
num_facture CHAR(6), 
prix_total DOUBLE
);

INSERT INTO 
utilisateur(prenom, nom, email, vill, actif)
VALUES
('Sandra','Nicouverture','sandra.nicouverture@gmail.com','Montpellier', 1),
('Vincent','Tim','vincent.tim@gmail.com','Calais', 1), 
('Barbe','ARA','barbe.ara@gmail.com','Antibes', 1), 
('Sacha','Touille','sacha.touille@gmail.com','Chamarande', 1);

INSERT INTO 
commande(utilisateur_id,date_achat, num_facture, prix_total)
VALUES
(1, '2019-01-14', 'A11111', 189.89), 
(2, '2019-05-14', 'B11112', 289.89), 
(2, '2023-02-22', 'A11113', 70.39), 
(4, '2017-09-09', 'A11114', 189.89);  

INSERT INTO 
commande(utilisateur_id,date_achat, num_facture, prix_total)
VALUES
(null, '2023-02-22', 'A11115', 33.33);

SELECT
id, prenom, nom, date_achat, num_facture, prix_total
FROM
utilisateur 
INNER JOIN commande ON utilisateur.id = commande.utilisateur_id;  -- le 'INNER' n'est pas obligatoire 

-- LEFT JOIN

SELECT*
FROM 
utilisateur
LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id;

-- RIGHT JOIN

SELECT *
FROM utilisateur
RIGHT JOIN commande ON utilisateur.id = commande.utilisateur_id;

-- Exemple left join en excluant les nulls
SELECT*
FROM utilisateur
LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id
WHERE utilisateur_id IS NOT NULL;

-- Le full join 

-- SELECT *
-- FROM
-- utilisateur
-- FULL JOIN commande ON utilisateur.id = commande.utilisateur_id; 
 -- MySQL ne supporte pa le FULL JOIN on doit donc cobiner un LEFT JOIN et un RIGHT JOIN
 
 SELECT * 
 FROM
 utilisateur 
 LEFT JOIN commande ON utilisateur.id = commande.utilisateur_id
 UNION
 SELECT * FROM 
 utilisateur 
 RIGHT JOIN commande ON utilisateur.id = commande.utilisateur_id;
 
 
