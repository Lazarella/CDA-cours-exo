-- -----------------------------------------------------
-- Schema ClassicModels
-- -----------------------------------------------------
DROP DATABASE IF EXISTS ClassicModels;
CREATE DATABASE  `ClassicModels` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_cs ;
USE `ClassicModels` ;

-- -----------------------------------------------------
-- Table `ClassicModels`.`Offices`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Offices` (
  `officeCode` VARCHAR(10) NOT NULL,
  `city` VARCHAR(50) NOT NULL,
  `phone` VARCHAR(50) NOT NULL,
  `addressLine1` VARCHAR(50) NOT NULL,
  `addressLine2` VARCHAR(50) NULL DEFAULT NULL,
  `state` VARCHAR(50) NULL DEFAULT NULL,
  `country` VARCHAR(50) NOT NULL,
  `postalCode` VARCHAR(15) NOT NULL,
  `territory` VARCHAR(10) NOT NULL,
  `officeLocation` POINT NOT NULL,
  PRIMARY KEY (`officeCode`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`Employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Employees` (
  `employeeNumber` INT(11) NOT NULL,
  `lastName` VARCHAR(50) NOT NULL,
  `firstName` VARCHAR(50) NOT NULL,
  `extension` VARCHAR(10) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `reportsTo` INT(11) NULL,
  `jobTitle` VARCHAR(50) NOT NULL,
  `officeCode` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`employeeNumber`),
  INDEX `fk_Employees_Employees_idx` (`reportsTo` ASC),
  INDEX `fk_Employees_Offices_idx` (`officeCode` ASC),
  CONSTRAINT `fk_Employees_Employees`
    FOREIGN KEY (`reportsTo`)
    REFERENCES `ClassicModels`.`Employees` (`employeeNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employees_Offices`
    FOREIGN KEY (`officeCode`)
    REFERENCES `ClassicModels`.`Offices` (`officeCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`Customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Customers` (
  `customerNumber` INT(11) NOT NULL,
  `customerName` VARCHAR(50) NOT NULL,
  `contactLastName` VARCHAR(50) NOT NULL,
  `contactFirstName` VARCHAR(50) NOT NULL,
  `phone` VARCHAR(50) NOT NULL,
  `addressLine1` VARCHAR(50) NOT NULL,
  `addressLine2` VARCHAR(50) NULL DEFAULT NULL,
  `city` VARCHAR(50) NOT NULL,
  `state` VARCHAR(50) NULL DEFAULT NULL,
  `postalCode` VARCHAR(15) NULL DEFAULT NULL,
  `country` VARCHAR(50) NOT NULL,
  `salesRepEmployeeNumber` INT(11) NULL,
  `creditLimit` DOUBLE NULL DEFAULT NULL,
  `customerLocation` POINT NOT NULL,
  PRIMARY KEY (`customerNumber`),
  INDEX `fk_Customers_Employees_idx` (`salesRepEmployeeNumber` ASC),
  CONSTRAINT `fk_Customers_Employees`
    FOREIGN KEY (`salesRepEmployeeNumber`)
    REFERENCES `ClassicModels`.`Employees` (`employeeNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`ProductLines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`ProductLines` (
  `productLine` VARCHAR(50) NOT NULL,
  `textDescription` VARCHAR(4000) NULL DEFAULT NULL,
  `htmlDescription` MEDIUMTEXT NULL DEFAULT NULL,
  `image` MEDIUMBLOB NULL DEFAULT NULL,
  PRIMARY KEY (`productLine`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`Products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Products` (
  `productCode` VARCHAR(15) NOT NULL,
  `productName` VARCHAR(70) NOT NULL,
  `productScale` VARCHAR(10) NOT NULL,
  `productVendor` VARCHAR(50) NOT NULL,
  `productDescription` TEXT NOT NULL,
  `quantityInStock` SMALLINT(6) NOT NULL,
  `buyPrice` DOUBLE NOT NULL,
  `MSRP` DOUBLE NOT NULL,
  `productLine` VARCHAR(50) NULL,
  PRIMARY KEY (`productCode`),
  INDEX `fk_Products_ProductLines_idx` (`productLine` ASC),
  CONSTRAINT `fk_Products_ProductLines`
    FOREIGN KEY (`productLine`)
    REFERENCES `ClassicModels`.`ProductLines` (`productLine`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Orders` (
  `orderNumber` INT(11) NOT NULL,
  `orderDate` DATETIME NOT NULL,
  `requiredDate` DATETIME NOT NULL,
  `shippedDate` DATETIME NULL DEFAULT NULL,
  `status` VARCHAR(15) NOT NULL,
  `comments` TEXT NULL DEFAULT NULL,
  `customerNumber` INT(11) NOT NULL,
  PRIMARY KEY (`orderNumber`),
  INDEX `fk_Orders_Customers_idx` (`customerNumber` ASC),
  CONSTRAINT `fk_Orders_Customers`
    FOREIGN KEY (`customerNumber`)
    REFERENCES `ClassicModels`.`Customers` (`customerNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`OrderDetails`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`OrderDetails` (
  `orderNumber` INT(11) NOT NULL,
  `productCode` VARCHAR(15) NOT NULL,
  `quantityOrdered` INT(11) NOT NULL,
  `priceEach` DOUBLE NOT NULL,
  `orderLineNumber` SMALLINT(6) NOT NULL,
  PRIMARY KEY (`productCode`, `orderNumber`),
  INDEX `fk_OrderDetails_Products_idx` (`productCode` ASC),
  INDEX `fk_OrderDetails_Orders_idx` (`orderNumber` ASC),
  CONSTRAINT `fk_OrderDetails_Products`
    FOREIGN KEY (`productCode`)
    REFERENCES `ClassicModels`.`Products` (`productCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_OrderDetails_Orders`
    FOREIGN KEY (`orderNumber`)
    REFERENCES `ClassicModels`.`Orders` (`orderNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `ClassicModels`.`Payments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ClassicModels`.`Payments` (
  `checkNumber` VARCHAR(50) NOT NULL,
  `paymentDate` DATETIME NOT NULL,
  `amount` DOUBLE NOT NULL,
  `customerNumber` INT(11) NOT NULL,
  PRIMARY KEY (`checkNumber`),
  INDEX `fk_Payments_Customers_idx` (`customerNumber` ASC),
  CONSTRAINT `fk_Payments_Customers`
    FOREIGN KEY (`customerNumber`)
    REFERENCES `ClassicModels`.`Customers` (`customerNumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

/**********************************************/
-- Requêtes vérification des enregistrements

SELECT * FROM Payments;
SELECT * FROM Customers; 

/***********************************************/

-- Question 1 : Afficher les noms, prénoms et titres de l’ensemble des employées en les ordonnant par leurs noms de famille

SELECT lastname, firstname, jobTitle
FROM Employees
ORDER BY lastname; 

-- Question 2 : 

SELECT DISTINCT lastname
FROM Employees;

-- Question 3 : Sélectionner et afficher le nom de la société, le prénom et le nom du contact des clients qui habitent aux USA

SELECT customerName, contactLastname, contactFirstname
FROM Customers 
WHERE country LIKE 'USA';

-- Question 4 : Sélectionner les emails des employées qui ont un firstname qui se termine par 'y' et qui ont un reportsTo qui commence par '105'

SELECT email
FROM Employees
WHERE firstname LIKE '%y' AND reportsTo LIKE '105%';

-- Question 5 : Sélectionner les noms et emails des employees qui ont un firstname qui commence par un L

SELECT lastname, email
FROM Employees
WHERE firstname LIKE 'L%';

-- Question 6 : Trier la table customers par ordre alphabétique à partir du contactLastName

SELECT *
FROM Customers
ORDER BY contactLastName; 

-- Question 7 : Trier la table employées par ordre croissant en se basant officeCode

SELECT * 
FROM Employees
ORDER BY officeCode; 

-- Question 8 : Sélectionner les clients qui ont payé pour plus de 100000 euros.

SELECT Customers.*, SUM(Payments.amount) AS TotalAmountPaid
FROM Customers 
INNER JOIN Payments ON Payments.customerNumber = Customers.customerNumber
GROUP BY Customers.customerNumber
HAVING TotalAmountPaid > 100000;

-- Réponse formateur 

SELECT DISTINCT ( SELECT customerName from customers WHERE customerNumber = pay.customerNumber)
FROM payments As pay 
WHERE amount > 10000; 

-- Question 9 : Afficher le total des ventes par 'orderNumber' et 'status'

SELECT Orders.orderNumber, Orders.status, SUM(OrderDetails.quantityOrdered * OrderDetails.priceEach) AS total_sales
FROM OrderDetails
INNER JOIN Orders ON Orders.orderNumber = OrderDetails.orderNumber
GROUP BY Orders.orderNumber, Orders.status
ORDER BY Orders.orderNumber, Orders.status;

-- Question 10 :  Afficher les “orderNumber”, “productName”, “msrp”, “priceEach” des produits qui un productcode = ‘S10_1678’ ont un msrp supérieur au priceEach

SELECT orderNumber, productName, msrp, priceEach
FROM OrderDetails
INNER JOIN Products ON OrderDetails.productCode = Products.productCode
WHERE Products.productCode LIKE 'S10_1678' AND msrp > priceEach;

-- Question 11 :  Sélectionner les emails des employées qui ont un firstname qui se termine par 'y' ou qui appartiennent à au bureau de San Francisco.

SELECT email
FROM Employees
JOIN Offices ON Employees.officeCode = Offices.officeCode
WHERE firstname LIKE '%y' OR officeLocation = 'San Francisco';

-- Question 12 :  Donner le nombre de client qui sont gérés par Leslie Jennings

SELECT count(customerName)
FROM Customers 
JOIN Employees ON  employeeNumber = salesRepEmployeeNumber
WHERE firstname LIKE 'Leslie' AND lastname LIKE 'Jennings';

-- Question 13 : Afficher le nom et prénom de la personne qui a le jobTitle de Président

SELECT jobTitle 
FROM Employees
ORDER BY jobTitle DESC;

SELECT firstname, lastname
FROM Employees
WHERE jobTitle LIKE 'President';

-- Question 14 : Donner la somme des montants des paiements reçu pendant le mois de Mars 2005

SELECT sum(paymentDate), paymentDate 
FROM Payments
WHERE paymentDate LIKE '2005-05-__ 00:00:00'
GROUP BY paymentDate; 

-- Question 15 : Afficher le total des paiements par nom des clients

SELECT sum(amount), customerName 
FROM Payments
INNER JOIN Customers ON Customers.customerNumber= Payments.customerNumber
GROUP BY Payments.customerNumber; 

-- Question 16 : Afficher la date de commande et le numéro client des commandes annulées

SELECT * FROM Orders; 

SELECT orderDate, customerNumber
FROM Orders
WHERE status LIKE 'Cancelled'; 

-- Question 17 :  Afficher la liste (prénom et nom ) des subordonnées de Bow Anthony

SELECT lastName, firstname
FROM Employees AS e
WHERE e.reportsTo
IN (
	SELECT employeeNumber FROM employees WHERE lastName = "Bow" AND firstName = "Anthony"
    )
    ;

-- Question 18 : Afficher le nom et le prénom du ou des employés qui n'ont pas de supérieur hiérarchique

SELECT firstName, lastName
FROM Employees 
WHERE reportsTo IS NULL;

-- Question 19 :  Dans le detail des commandes afficher la commande avec la plus petite quantité

SELECT *
FROM OrderDetails
WHERE quantityOrdered = (SELECT MIN(quantityOrdered) FROM OrderDetails);

-- Question 20 : Afficher le detail de la commande qui est datée du 21-04-2003

SELECT *
FROM OrderDetails
INNER JOIN Orders ON  Orders.orderNumber = OrderDetails.orderNumber 
WHERE orderDate LIKE '2003-04-21 00:00:00'; 

-- Question 21 :  Afficher la liste des managers avec les employées qu’ils managent. Le nom
-- de la colonne s’appellera ‘Manager’ pour la colonne des managers, elle
-- regroupera leurs noms et prénoms. Idem pour la colonne employée, elle
-- s’appellera ‘Employée’, elle affichera le nom et prénom des employés.

SELECT CONCAT(m.firstName, ' ', m.lastName) AS Manager, CONCAT(e.firstName, ' ', e.lastName) AS Employee
FROM Employees e
INNER JOIN Employees m ON e.reportsTo = m.employeeNumber;

-- Question 22 : Afficher le nom des managers et le nombre d’employé qu’ils managent

SELECT m.lastName, m.firstname, COUNT(e.reportsTo)
FROM Employees e
INNER JOIN Employees m ON e.reportsTo = m.employeeNumber
GROUP BY m.lastname,m.firstname ;

