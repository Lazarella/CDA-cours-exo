CREATE DATABASE  urbain;
USE urbain;

CREATE TABLE IF NOT EXISTS villes_france_free (
  ville_id int NOT NULL,
  ville_departement varchar(3) DEFAULT NULL,
  ville_slug varchar(255) DEFAULT NULL,
  ville_nom varchar(45) DEFAULT NULL,
  ville_nom_simple varchar(45) DEFAULT NULL,
  ville_nom_reel varchar(45) DEFAULT NULL,
  ville_nom_soundex varchar(20) DEFAULT NULL,
  ville_nom_metaphone varchar(22) DEFAULT NULL,
  ville_code_postal varchar(255) DEFAULT NULL,
  ville_commune varchar(3) DEFAULT NULL,
  ville_code_commune varchar(5) NOT NULL,
  ville_arrondissement smallint DEFAULT NULL,
  ville_canton varchar(4) DEFAULT NULL,
  ville_amdi smallint DEFAULT NULL,
  ville_population_2010 int DEFAULT NULL,
  ville_population_1999 int DEFAULT NULL,
  ville_population_2012 int DEFAULT NULL ,
  ville_densite_2010 int DEFAULT NULL,
  ville_surface float DEFAULT NULL,
  ville_longitude_deg float DEFAULT NULL,
  ville_latitude_deg float DEFAULT NULL,
  ville_longitude_grd varchar(9) DEFAULT NULL,
  ville_latitude_grd varchar(8) DEFAULT NULL,
  ville_longitude_dms varchar(9) DEFAULT NULL,
  ville_latitude_dms varchar(8) DEFAULT NULL,
  ville_zmin int DEFAULT NULL,
  ville_zmax int DEFAULT NULL,
  PRIMARY KEY (ville_id)
);
CREATE TABLE IF NOT EXISTS departement (
  departement_id INT NOT NULL,
  departement_code VARCHAR(3) ,
  departement_nom VARCHAR(255),
  departement_nom_uppercase VARCHAR(255),
  departement_slug VARCHAR(255),
  departement_nom_soundex VARCHAR(20),
  PRIMARY KEY (departement_id)
);


SELECT * FROM villes_france_free; 
SELECT * FROM departement; 

-- Question 1 

SELECT * 
FROM villes_france_free
ORDER BY  ville_population_2012 DESC
LIMIT 10;

-- Question 2 

SELECT * 
FROM villes_france_free
ORDER BY ville_surface
LIMIT 50;

-- Question 3 
SELECT * 
FROM 
departement
WHERE 
departement_code LIKE "97%"; 

-- Question 4 

SELECT ville_nom, departement_nom
FROM villes_france_free 
LEFT JOIN departement ON departement_code = ville_departement
ORDER BY ville_population_2012 DESC
LIMIT 10;

-- Question 5 

SELECT 
departement_nom, ville_departement, COUNT(*) AS nombre_de_communes
FROM 
villes_france_free
INNER JOIN 
departement ON departement_code = ville_departement
GROUP BY 
departement_nom, ville_departement
ORDER BY 
nombre_de_communes DESC; 

-- Question 6 

SELECT departement_nom, ville_departement, sum(ville_surface) AS superficie_de_communes
FROM villes_france_free
INNER JOIN departement ON departement_code = ville_departement
GROUP BY departement_nom, ville_departement
ORDER BY superficie_de_communes DESC
LIMIT 10; 

-- Question 7

SELECT count(ville_id)
FROM villes_france_free
WHERE 
ville_nom LIKE "Saint%"; 

-- Question 8

SELECT ville_nom, COUNT(*) AS occurrences
FROM villes_france_free
Group BY ville_nom
Having occurrences >1
ORDER BY occurrences DESC;

-- Question 9 

SELECT ville_nom, ville_surface
FROM villes_france_free
WHERE ville_surface> 
(SELECT AVG(ville_surface) FROM villes_france_free)
ORDER BY ville_surface;

-- Question 10 

SELECT ville_departement, departement_nom, sum(ville_population_2012) AS pop_2012
FROM villes_france_free
INNER JOIN departement ON departement_code = ville_departement
GROUP BY 
ville_departement, departement_nom
HAVING 
pop_2012 > 2000000;


-- Question 11
SELECT 
    ville_nom, 
    REPLACE(ville_nom, '-', ' ') AS ville_nom_modifie
FROM 
    villes_france_free
WHERE 
    ville_nom LIKE 'SAINT-%' OR ville_nom LIKE 'SAINT_%';

 






