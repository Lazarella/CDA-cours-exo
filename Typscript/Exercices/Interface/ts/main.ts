interface User {
    name: string; 
    age : number; 
    occupation?: string
}
interface Admin extends User{
    Admin: boolean; 
}

type person = User|Admin; 

let personArray: person [] = []

let ObjetA : person = {
    name: 'Toto Dupont',
    age: 35,
    occupation: 'Facteur' 
}
personArray.push(ObjetA)

let ObjetB : person = {
    name: 'Jeanne Doe',
    age: 25,
    Admin: true 
}

personArray.push(ObjetB)

let ObjetC : person = {
    name: 'Michel Michel',
    age: 23,
    occupation: 'Lutteur'
}

personArray.push(ObjetC)

let ObjetD : person = {
    name: 'Michael Flinch',
    age: 64,
    Admin: false 
}

personArray.push(ObjetD)

console.table(personArray);

displayFullName(personArray): person {
    for(let i =0; i< personArray.length; i++ ){
        
        
    }
}