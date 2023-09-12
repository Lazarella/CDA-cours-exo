let read ="",
growthRate=0.89/100,
year = 2015,
pop=96809; 

const DATA = document.querySelector(".data")

read += `<h3>Accroissement de la population de Tourcoing</h4>`; 

read += `<p>En <b>2015</b>, il a été recensé <b>96806 habitants. le taux d'accroissement de la population étant de <b>0.89%, combien faudra-t-il d'années pour atteindre une population de <b>120.000 habitants</b>?</p><hr>`;

while(pop<=120000){
pop = Math.round((pop*growthRate)+pop);
console.log(pop);
year++;
read += `<p>En <b>${year}</b>, il y aura <b>${pop} habitants</b><hr></p>`; 
}


DATA.innerHTML = read; 