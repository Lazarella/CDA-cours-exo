let str,
strLower,
strArr=[], 
strUppercase, 
affichage ='', 
firstLetter;
const DATA = document.querySelector(".data");

str = prompt("Veuillez entrer une phrase de votre choix ✪ ω ✪");
console.log(str);
affichage = `<h5>Vous avez saisi : ${str}</h5>`; 
strLower =str.toLowerCase()
affichage += `<h5>La chaine en minuscule : ${strLower}</h5>`;
strArr= strLower.split(" ");  
affichage += `<h5>Mise en tableau : ${strArr}</h5>`;

const capitalizedWords = strArr.map(word => {
    return word.charAt(0).toUpperCase() + word.slice(1);
});
strUppercase = capitalizedWords.join(" ");

affichage += `La chaîne après traitement : ${strUppercase}`


DATA.innerHTML= affichage; 

// let str,
//     strLower,
//     strArr = [],
//     strUppercase,
//     affichage = '',
//     firstLetter;
// const DATA = document.querySelector(".data");

// str = prompt("Veuillez entrer une phrase de votre choix ✪ ω ✪");
// console.log(str);
// affichage = `<h5>Vous avez saisi : ${str}</h5>`;
// strLower = str.toLowerCase();
// affichage += `<h5>La chaine en minuscule : ${strLower}</h5>`;
// strArr = strLower.split(" ");
// affichage += `<h5>Mise en tableau : ${strArr}</h5>`;
// const capitalizedWords = strArr.map(word => {
//     return word.charAt(0).toUpperCase() + word.slice(1);
// });
// strUppercase = capitalizedWords.join(" ");

// affichage += `La chaîne après traitement : ${strUppercase}`;

// DATA.innerHTML = affichage;
