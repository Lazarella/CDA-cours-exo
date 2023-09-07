
let firstName = prompt("C'est le moment de se présenter!\nQuel est votre prénom?");

let lastName = prompt("Et votre nom de famille?"); 

let greetings = firstName+" "+lastName


const DATA = document.querySelector(".data"); 

DATA.innerHTML = (`<p>Vous avez saisi : ${firstName}<br>Vous avez saisi : ${lastName}<br>Bonjour ${greetings} </p>`)