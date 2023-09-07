let sideAB, 
cleanSideAB, 
sideAC, 
cleanSideAC,
Hypo, 
cleanHypo 
read =""; 

const DATA = document.querySelector(".data"); 

sideAB = parseFloat(prompt(`Veuillez entrer la mesure du côté AB en cm (nombre entier ou décimal)`));
sideAC = parseFloat(prompt(`Veuillez entrer la mesure du côté AC en cm (nombre entier ou décimal)`));

cleanSideAB =Math.round(sideAB*10)/10; 
cleanSideAC =Math.round(sideAC*10)/10; 

Hypo = Math.sqrt((Math.pow(sideAB,2)+Math.pow(sideAC, 2)));

console.log(Hypo); 

cleanHypo = Math.round(Hypo*100)/100;

read+= `Les longeurs des côtés adjacent à l'angle droit étant de ${cleanSideAB} cm et de ${cleanSideAC} cm <br>`
read += `‣ La longeur de l'hypothénuse est de ${cleanHypo} cm`

DATA.innerHTML = read; 
