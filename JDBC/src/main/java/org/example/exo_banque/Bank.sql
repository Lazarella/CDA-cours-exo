CREATE DATABASE banque; 
USE banque; 

CREATE TABLE IF NOT EXISTS clients(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(200),
last_name VARCHAR(200),
telephone VARCHAR(10) 
);

CREATE TABLE IF NOT EXISTS accounts(
id_account INT AUTO_INCREMENT PRIMARY KEY, 
balance DOUBLE, 
id_client INT,
FOREIGN KEY (id_client) REFERENCES clients(id) 
);

CREATE TABLE IF NOT EXISTS transactions(
amount DOUBLE, 
-- id_client INT,
num INT, 
PRIMARY KEY (num),
FOREIGN KEY (num) REFERENCES accounts(id_account)
); 

SELECT * FROM clients;