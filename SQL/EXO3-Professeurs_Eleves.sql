CREATE DATABASE IF NOT EXISTS prof_eleve; 
USE prof_eleve; 
-- DROP DATABASE prof_eleve; 

CREATE TABLE IF NOT EXISTS professeur(
professeur_id INT AUTO_INCREMENT PRIMARY KEY,
professeur_prenom VARCHAR(50),
professeur_nom VARCHAR(50),
professeur_num_classe INT,
professeur_num_departement INT,
professeur_email VARCHAR(100) UNIQUE,
professeur_telephone CHAR(10) UNIQUE
);

CREATE TABLE IF NOT EXISTS eleve(
eleve_id INT AUTO_INCREMENT PRIMARY KEY, 
eleve_prenom VARCHAR(50),
eleve_nom VARCHAR(50), 
eleve_telephone CHAR(10) NOT NULL UNIQUE, 
eleve_num_classe INT, 
eleve_date_diplome DATE
);

CREATE TABLE IF NOT EXISTS eleve_prof(
eleve_prof_id INT NOT NULL AUTO_INCREMENT,
professeur_id INT, 
eleve_id INT, 
PRIMARY KEY (eleve_prof_id),
FOREIGN KEY (professeur_id) REFERENCES professeur(professeur_id), 
FOREIGN KEY (eleve_id) REFERENCES eleve(eleve_id) 
);

INSERT INTO 
professeur
(professeur_prenom, professeur_nom, professeur_num_classe, professeur_num_departement,professeur_email, professeur_telephone) 
VALUES
('Albus', 'Dumbledor', 102, '1', 'albus.dumbledor@chouette.com', '1111111111'),
('Minerva', 'MacGonagall', '103', '1', 'minerva.macgonagall@chouette.com', '2222222222'); 

INSERT INTO 
eleve
(eleve_prenom, eleve_nom, eleve_telephone, eleve_num_classe, eleve_date_diplome)
VALUES 
('Harry','Potter','0123456789',4,'2015-06-06'), 
('Hermione','Granger','0223456789',3,'2015-06-06'),
('Ronald','Wisley','0323456789',9,'2015-06-06');
 
INSERT INTO eleve_prof 
(professeur_id, eleve_id)
VALUES
(1, 1),
(1,2),
(2,2);

SELECT * FROM professeur;
SELECT * FROM eleve; 

