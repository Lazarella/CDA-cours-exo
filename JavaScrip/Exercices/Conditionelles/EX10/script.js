let read ="", 
mail="contact@teamjs.fr",
mailTest, 
mdp ="LeLundiAuSoleil",
mdpTest;

const DATA = document.querySelector(".data"); 

mailTest = prompt(`Veuillez entrer vor mail`);
mdpTest = prompt(`Veuillez entrer votre mot de passe`);

read += `<h3>Test de connection</h3>`; 

if(mail===mailTest && mdp===mdpTest){
    read += `Bienvenue sur votre espace sécurisé (ou pas)`;
}else{
    read += `Les informations saisies sont incorrectes`;
}


DATA.innerHTML = read; 