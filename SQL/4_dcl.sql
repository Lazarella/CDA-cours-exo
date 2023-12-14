-- Créer un utilisateur 
CREATE USER 'Toto'@'localhost' IDENTIFIED BY 'test'; 
CREATE USER 'Titi'@'localhost' IDENTIFIED BY '1234'; 

-- Donner tous les droits 
GRANT ALL PRIVILEGES ON *.* TO 'Toto'@'localhost'; 

-- Voir les privilèges

SHOW GRANTS;

-- Donner tous les droits sur une base spécifique 
GRANT ALL PRIVILEGES ON entreprise_demo.* TO 'Titi'@'localhost' ;

-- Donner des droits en lecture sur une bdd
Grant SELECT ON exo_annuaire.adresse TO 'Titi'@'localhost' ;

GRANT INSERT, DELETE  ON exo_annuaire.adresse TO 'Titi'@'localhost';

-- Donne l'acces à la colonne nom et prénom de personne 

GRANT SELECT (nom, prenom) ON exo_annuaire.personne TO 'Titi'@'localhost';

-- Recharger la table des droits 
FLUSH PRIVILEGES; 
SHOW GRANTS FOR 'Titi'@'localhost';

