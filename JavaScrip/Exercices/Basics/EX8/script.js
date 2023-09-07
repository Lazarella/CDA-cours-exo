let rate, 
brut, 
ttc,
tva,
read =""; 

const DATA = document.querySelector(".data"); 

brut = parseFloat(prompt(`Veuillez indiquer le prix H.T. de l'item`));
rate = parseFloat(prompt(`Veuillez indiquer le montant de la T.V.A. (en %)`));

tva = brut*(rate/100); 
ttc = brut+tva;

read += `Le prix de l'objet étant de ${brut}€, avex un tax de T.V.A. applicable de ${rate}%<br>` 
read += `‣ Le montant de la T.V.A. s'élévera à ${tva}€<br>`
read += `‣ Le prix T.T.C. de l'objet sera de ${ttc}€<br>`

DATA.innerHTML = read ; 
