/*

Les tableaux à deux dimenssions

*/

console.log("------------ Les tableaux à 2 dimenssion -----------");

let veggie2=["Kale", "Zuccini", "Pumkin"];
let fruit=["Banana", "Tomato", "Cherry"];

let primeur =[veggie2,fruit];

console.table(primeur);
console.log(primeur[0][2]);

// Système Clef/Valeur

let zoo=[
    {
        name:"Simba",
        race:"lion",
        continent:"Africa"
    },
    {
        name:"Jack",
        race:"Kangaroo",
        continent:"Australia"
    }
];

console.table(zoo);
console.log(`Les noms de sont : ${zoo[0].name} et ${zoo[1].name}`);