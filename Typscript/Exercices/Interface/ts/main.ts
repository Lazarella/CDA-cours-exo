interface User {
    name: string; 
    age : number; 
    occupation?: string
}
interface Admin extends User{
    Admin: boolean; 
}

type person = User|Admin; 

let personArray: person [] = [
    
{
    name: 'Toto Dupont',
    age: 35,
    occupation: 'Facteur' 
}
,
{
    name: 'Jeanne Doe',
    age: 25,
    Admin: true 
}
,

{
    name: 'Michel Michel',
    age: 23,
    occupation: 'Lutteur'
}
,
{
    name: 'Michael Flinch',
    age: 64,
    Admin: false 
}
]


console.table(personArray);

function displayFullName(personArray: person[]): person | null {
    for(let i =0; i< personArray.length; i++ ){ 
        const person = personArray[i]; 
        if (person.name){
            console.log(`Coucou ${person.name}`);
        }
    }
    console.warn("There is nobody here anymore")
    return null
}

displayFullName(personArray)

personArray.forEach(person =>console.log(person.name+" "+person.age)) // Do the same work as the function displayFullName but more efficiently 
