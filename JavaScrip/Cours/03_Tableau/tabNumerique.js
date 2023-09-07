/*
Les tableaux numériques (accéder aux éléments via l'index [])

*/

let myArray=[];
// équivalent let myArray = new Array()

myArray[0]="Apple";
myArray[1]="Pear";

console.log(myArray);
console.table(myArray);


let vegetable= ["Carrot", "Zuccini", "Eggplant", "Kale"];
console.log(vegetable[2]); 

vegetable[2] = "Spinage"; 
console.log(vegetable[2]); 

let nbVegetable = vegetable.length; 
console.log(`My array contain ${nbVegetable} vegetables`);
vegetable[vegetable.length]="Pumkin"; // est équivalent au .push()
console.table(vegetable);

vegetable.pop(); // Retirer le dernier élément d'un tableau

vegetable.shift(); //Retirer le premier élément d'un tableau
console.table(vegetable);
