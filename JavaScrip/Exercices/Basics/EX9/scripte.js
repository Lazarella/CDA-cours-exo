let rate,
capitalInit, 
capitalEnd
time,
bonus, 
read="";

const DATA = document.querySelector(".data"); 



read += `Avec un capital initial de ${capitalInit}€, placé à ${rate}% pendant ${time} année(s)`
read += `‣ Le montant total des intérêts s'élèvera à ${capitalEnd}€` 
read += `‣ Le capital à l'issue sera de ${capitalEnd}€` 

DATA.innerHTML = read; 