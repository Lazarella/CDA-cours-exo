/*

Les tableaux associatifs (accès via la clef)

*/

let users = {
    name:"Odysseus",
    firstName: "Shirka", 
    age: "shush" 
}

// affichage de la valeur associé à une clef

console.log(users.firstName);
console.log(users["name"]); //équivalent à la ligne du dessus, la syntax varie simplement

users["Job"]="Navigator";
console.table(users);