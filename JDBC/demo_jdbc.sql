CREATE DATABASE if not EXISTS demo_jdbc; 
Use demo_jdbc; 



CREATE TABLE person (
id int AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50)
);
drop table person; 

SELECT * from person; 