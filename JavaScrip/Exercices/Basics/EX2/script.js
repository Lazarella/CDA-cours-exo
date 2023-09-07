let nb1= parseInt(prompt("Entrez un premier nombre"));
let nb2= parseInt(prompt("Entrez un second nombre, merci ヾ(•ω•`)o"))

let result = nb1+nb2; 

const DATA= document.querySelector(".data"); 

DATA.innerHTML = (`<p>Vous avez saisi : ${nb1}<br>Vous avez saisi : ${nb2}<br>La some de ${nb1} + ${nb2} = ${result}</p>`);