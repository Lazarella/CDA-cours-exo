CREATE DATABASE varsity; 
Use varsity; 

CREATE TABLE if not exists student (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
gradeNum VARCHAR(5),
graduation_date DATE 
); 

SELECT * FROM student; 

INSERT INTO student (first_name, last_name, gradeNum, graduation_date) VALUES 
('John', 'Doe', 'A1', '2023-06-30'),
('Jane', 'Smith', 'A2', '2023-07-15'),
('Emily', 'Johnson', 'B1', '2022-12-12'),
('Michael', 'Brown', 'B2', '2023-05-20'),
('Sarah', 'Davis', 'C1', '2022-11-10'),
('Alice', 'Wilson', 'C3', '2023-08-22'),
('William', 'Taylor', 'C2', '2022-10-05'),
('Sophia', 'Lee', 'A1', '2023-09-17'),
('James', 'Harris', 'A2', '2023-04-23'),
('Olivia', 'Clark', 'A1', '2022-08-30'),
('Benjamin', 'Robinson', 'B2', '2023-01-19'),
('Isabella', 'Walker', 'B1', '2023-02-22'),
('Elijah', 'Perez', 'B2', '2023-03-28'),
('Charlotte', 'Hall', 'B1', '2022-07-11'),
('Lucas', 'Young', 'B2', '2023-08-14'),
('Mia', 'Allen', 'C1', '2022-06-06'),
('Amelia', 'Sanchez', 'C2', '2023-05-13'),
('Harper', 'Wright', 'C1', '2023-10-09'),
('Ethan', 'King', 'C2', '2022-09-21'),
('Ava', 'Scott', 'C1', '2023-12-25'),
('Alexander', 'Green', 'C2', '2022-11-30'),
('Abigail', 'Baker', 'C1', '2023-07-20'),
('Samuel', 'Adams', 'C2', '2022-12-15'),
('Madison', 'Gonzalez', 'C1', '2023-06-18'),
('Joseph', 'Carter', 'C2', '2023-03-05'),
('Lily', 'Phillips', 'B1', '2022-10-27'),
('Gabriel', 'Evans', 'B2', '2023-09-12'),
('Sofia', 'Turner', 'B1', '2022-08-03'),
('Carter', 'Torres', 'C2', '2023-01-28'),
('Grace', 'Martinez', 'C1', '2023-04-17'),
('Owen', 'Anderson', 'C2', '2022-07-09');

