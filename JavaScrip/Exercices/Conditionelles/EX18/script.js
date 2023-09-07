let read ="",
baverage;


const DATA = document.querySelector(".data"); 

baverage = parseInt(prompt(`****** Distributeur de boisson ******\n\n1/ Eau\n2/ Jus d'oranges\n3/ Limonade\n4/ Café\n5/ Thé\n\nFaîtes votre choix :\n`));

switch(baverage){
    case 1 : 
    read = `<p>Vous avez selectionné ${baverage}</p><p>Votre <b>Eau</b> est servie (o゜▽゜)o☆`;
    break;
    case 2 : 
    read = `<p>Vous avez selectionné ${baverage}</p><p>Votre <b>Jus d'oranges</b> est servie (o゜▽゜)o☆`;
    break;
    case 3 : 
    read = `<p>Vous avez selectionné ${baverage}</p><p>Votre <b>Limonade</b> est servie (o゜▽゜)o☆`;
    break;
    case 4 : 
    read = `<p>Vous avez selectionné ${baverage}</p><p>Votre <b>Café</b> est servie (o゜▽゜)o☆`;
    break;
    case 5 : 
    read = `<p>Vous avez selectionné ${baverage}</p><p>Votre <b>Thé</b> est servie (o゜▽゜)o☆`;
    break;
    default: 
    read = `<p>Je n'ai pas compris la commande</p>`;
}

DATA.innerHTML = read; 