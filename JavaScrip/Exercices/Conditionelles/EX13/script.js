let read ="",
age; 

const DATA = document.querySelector(".data"); 

age = parseInt(prompt("Veuillez entrer l'âge de votre enfant"))

if(age<3){
    read = `<p>Votre enfant est trop jeune pour pratiquer</p>`;
}
else if(age>=3 && age <=6){
    read = `<p>Votre enfant est un <b>Baby</b></p>`;
}
else if(age>=7 && age <=8){
    read = `<p>Votre enfant est un <b>Poussin</b></p>`;
}
else if(age>=9 && age <=10){
    read = `<p>Votre enfant est une <b>Pupille</b></p>`;
}
else if(age>=11 && age <=12){
    read = `<p>Votre enfant est un <b>Minime</b></p>`;
}
else if(age>=13 && age <=17){
    read = `<p>Votre enfant est un <b>Cadet</b></p>`;
}else{
    read = `<p>Votre enfant joue dans la cours des grands maintenant!</p>`;
    
}
DATA.innerHTML = read; 