-- INSERT INTO

use entreprise_demo; 

-- Méthode 1
-- Sans préciser les colonnes

INSERT INTO service
VALUES (NULL, 'RH', '2023-12-12');

-- Méthode 2 
-- En précisant les colonnes

INSERT INTO service
(libelle, date_modification)
VALUES 
('Comptabilité', '2023-12-12'),
('Technologique', '2023-12-12');

-- Méthode 3
-- via requête imbriquée

INSERT INTO service
(libelle, date_modification)
SELECT
'R&D' as libelle, 
'2023-12-12' as date_modification; 

-- Méthode 4 
-- via un SET
	
SELECT * FROM service; -- pour voir la DATA

-- DELETE FROM

-- Supprimer tout les enregistrement de table
DELETE FROM service; 

-- Suppression avec condition sur l'id
DELETE FROM service WHERE service_id = 4; 

-- Suppression avec condition sur le libellé
DELETE FROM service WHERE libelle = 'Technologique';

-- UPDATE

-- Mise à jour de l'enregistrement 

UPDATE service 
SET 
	libelle = 'Tech',
    date_modification = now()
    WHERE 
    service_id = 9; 
    
    -- SELECT 
    
    -- Selectionner toutes les colonnes d'une table 
    SELECT * FROM service;
    
    -- Selectionner une colonne d'une table 
    SELECT libelle FROM service; 
    
    -- Selectionner plusieurs colonnes d'une table
    SELECT service_id, libelle FROM service; 
    
    -- Prefixer les colonnes du nom de la table
    SELECT service.service.id, service.libelle FROM service; 
    
    INSERT INTO salarie
    (prenom, non, age, salaire, service_id)
    VALUES 
    ('Jeanne', 'DUFLAN', 35, 2800, 8),
	('Jean-Jean', 'Pollet', 42, 2000, 6),
	('Sandrine', 'Creaser', 28, 2300, 9),
	('Astrid', 'Cameo', 55, 3200, 9),
	('Sylvain', 'Leroux', 36, 2800, 8);
    
    SELECT *FROM salarie; 
    
    -- Selection sur plusieurs tables
    SELECT * FROM salarie, service; 
    
    -- instruction where 
    SELECT non, prenom 
    FROM salarie
    WHERE salaire < 2300; 

SELECT non, prenom
FROM salarie
WHERE salaire > 2300 AND age > 33; 

SELECT non, prenom
FROM salarie 
WHERE age < 33 OR salaire < 3000; 

SELECT non, prenom
FROM salarie 
WHERE age BETWEEN 33 AND 45 ;

-- DISTINCT : élimine les doublons


-- LIMIT : spécifie le nombre de ligne à retourner
SELECT * FROM salarie LIMIT 2; 

-- ORDER BY : retourne le résultat dans un ordre définit 

SELECT * FROM salarie ORDER BY non; 

-- Requettes imbriquées
 SELECT non, prenom
 FROM (SELECT * FROM salarie WHERE prenom LIKE 'j%')AS nom_en_r
 WHERE age > 35; 
 
 SELECT service_id, COUNT(service_id) AS "nombre de salariés" FROM salarie GROUP BY service_id; 
 
 SELECT * FROM salarie WHERE prenom = "jean-jean"; 
 
 SELECT * FROM salarie WHERE salarie_id = 2; -- recherche par colonne index plus efficace
 
SELECT service_id, AVG(salaire) FROM salarie GROUP BY service_id HAVING AVG(salaire) > 3000; 





