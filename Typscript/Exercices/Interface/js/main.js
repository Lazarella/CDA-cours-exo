"use strict";
let personArray = [
    {
        name: 'Toto Dupont',
        age: 35,
        occupation: 'Facteur'
    },
    {
        name: 'Jeanne Doe',
        age: 25,
        Admin: true
    },
    {
        name: 'Michel Michel',
        age: 23,
        occupation: 'Lutteur'
    },
    {
        name: 'Michael Flinch',
        age: 64,
        Admin: false
    }
];
console.table(personArray);
function displayFullName(personArray) {
    for (let i = 0; i < personArray.length; i++) {
        const person = personArray[i];
        if (person.name) {
            console.log(`Coucou ${person.name}`);
        }
    }
    console.warn("There is nobody here anymore");
    return null;
}
displayFullName(personArray);
personArray.forEach(person => console.log(person.name + " " + person.age)); // Do the same work as the function displayFullName but more efficiently 
