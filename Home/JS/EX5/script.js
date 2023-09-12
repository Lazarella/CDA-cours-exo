let word, 
lowerWord, 
upperWord,  
firstLetter,
arrWord,
read;

const CONTAINT=document.querySelector(".containt");

word = prompt(`Veuillez entrer une phrase ( ⓛ ω ⓛ *)` ); 
read = `Vous avez saisi : <b>${word}</b><br>`;

lowerWord = word.toLowerCase();
read+= `La chaîne en minuscule : ${lowerWord}<br>`; 

arrWord = lowerWord.split(""); 
read+= `Mise en tableau : ${arrWord}<br>`;

arrWord2 = lowerWord.split(" ");
firstLetter = arrWord2.map(word=>word.charAt(0).toUpperCase()+word.slice(1));
upperWord= firstLetter.join(" ");

read += `La chaîne après traitement :  ${upperWord}`



CONTAINT.innerHTML=read;

// SaLut cOmmmENT ça va?

