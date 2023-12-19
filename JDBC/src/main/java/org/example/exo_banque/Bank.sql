CREATE DATABASE banque; 
USE banque; 

CREATE TABLE IF NOT EXISTS clients(
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(200),
last_name VARCHAR(200),
telephone VARCHAR(10) 
);

CREATE TABLE IF NOT EXISTS accounts(
id INT AUTO_INCREMENT PRIMARY KEY, 
balance DOUBLE, 
id_client INT,
FOREIGN KEY (id_client) REFERENCES id(clients) 
);

CREATE TABLE IF NOT EXISTS transactions(
number int AUTO_INCREMENT,
amount DOUBLE, 
-- id_client INT,
id_account INT, 
PRIMARY KEY (id_account),
FOREIGN KEY (id_account) REFERENCES id(accounts)
); 