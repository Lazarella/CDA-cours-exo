let pi = Math.pi; 
let diameter = parseInt(prompt("Veuillez entrer le diamètre du cercle (en cm)"));
let raySquare = (diameter/2)**2,
perimeter= diameter*pi, 
perimeterRounded= Math.floor(perimeter), 
area = raySquare*pi, 
areaRounded = Math.floor(area);


const DATA = document.querySelector(".data");

DATA.innerHTML = (`<b>Calcul du périmètre <(i>d x π)</i> et de l'air <i>(π * r²)</i> d'un cercle<br> Diamètre = ${diameter}cm<br>Périmètre = ${perimeter}cm<br>Aire = ${area}cm<br>Périmètre (arrondi) ${perimeterRounded}cm<br>Aire(arrondi) = ${areaRounded}cm²`)