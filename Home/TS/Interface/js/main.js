"use strict";
let personArray = [];
let ObjetA = {
    name: 'Toto Dupont',
    age: 35,
    occupation: 'Facteur'
};
personArray.push(ObjetA);
let ObjetB = {
    name: 'Jeanne Doe',
    age: 25,
    Admin: true
};
personArray.push(ObjetB);
let ObjetC = {
    name: 'Michel Michel',
    age: 23,
    occupation: 'Lutteur'
};
personArray.push(ObjetC);
let ObjetD = {
    name: 'Michael Flinch',
    age: 64,
    Admin: false
};
personArray.push(ObjetD);
console.table(personArray);
function displayFullName(personArray) {
    for (let i = 0; i < personArray.length; i++) {
        const person = personArray[i];
        if (person.name) {
            console.log(`Full Name: ${person.name}`);
        }
    }
    console.warn("There is no one here anymore");
    return null;
}
displayFullName(personArray);
