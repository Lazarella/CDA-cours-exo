//Even or Odd: Write a program that takes an integer as input and prints whether it's even or odd.
let UserNb;
//UserNb = prompt("Entrez un nombre entier"); Remove comment to run

function EvenOdd(A){
A%2!=0? console.log("Votre nombre est impaire"):  console.log("Votre nombre est paire");
}

//EvenOdd(UserNb); Remove comment to run

// Temperature Check: Create a temperature conversion program. Ask the user for input in Celsius and convert it to Fahrenheit using the formula: (Celsius * 9/5) + 32.

let UserTemp;

// UserTemp=prompt("Entrez une température en °Celsius"); Remove comment to run

function TempConverter(Celsius){
    let fahrenheit =(Celsius * 9/5) + 32 
    return alert(Celsius+ "° Celsius est l'équivalent de "+ fahrenheit+" ° Fahrenheit")
}

//TempConverter(UserTemp); Remove comment to run

// Grade Classifier: Create a program that takes a student's score as input and prints out their grade. Use the following grading scale: 90-100 (A), 80-89 (B), 70-79 (C), 60-69 (D), below 60 (F).

// Factorial Calculator: Write a program that calculates the factorial of a given number using a loop. The factorial of a number n is the product of all positive integers from 1 to n.



