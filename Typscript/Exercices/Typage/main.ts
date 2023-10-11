//1

let userName : string = "Lazare";

//2
let userAge : number = 34; 

//3

let islogin : boolean = false; 

//4

let userNames : string[] =[] ; 
userNames.push(userName); 
console.table(userNames);

//5 

let person : object = {
    firstName: "Dupont",  
    age: 20,
    isLoggedIn: true,
};
//console.log(person.age) // il n'est pas possible d'afficher la valeur age dans la console

//6

let personne1 :  {
    firstName : string,
    age: number, 
    isLoggedIn : boolean,
}= {
    firstName: "Dupont",
    age: 20,
    isLoggedIn: true
}
console.log(personne1.age); 

//7 

let personne2 ={
    firstName: "Dupont",
    age: 20,
    isLoggedIn: true
}

console.log(personne2.age);

//8

let infos : [string, number]




