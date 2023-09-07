let read ="",
rate,
incomes,
taxable = 0, 
nbAdult, 
nbChild,
nbPart
;


const DATA = document.querySelector(".data"); 

incomes=parseFloat(prompt(`Veuillez entrer le montant de vos revenus pour l'année fiscale`));
nbAdult = parseFloat(prompt(`De combien d'adulte(s) est composé votre foyer?`));
nbChild = parseFloat(prompt(`Combien d'enfants vivent à votre charge?`));

if (nbChild<=2){
    nbPart = nbAdult+nbChild/2;
}else{
    nbPart = +nbAdult+(nbChild -1);
}
console.log(nbPart);

taxable = (incomes*rate)/nbPart;

switch (true) {
    case incomes <= 10777:
    rate = 0;
    break;
    case incomes <= 27478:
    rate = 11 / 100;
    break;
    case incomes <= 78570:
    rate = 30 / 100;
    break;
    case incomes <= 168994:
    rate = 41 / 100;
    break;
    default:
    rate = 45 / 100;
    break;
    
    }
  taxable = (incomes * rate) / nbPart;

read = `Le montant de l'impôt sur le revenu pour un foyer composé de ${nbAdult} adulte(s) et de ${nbChild} enfant(s), avec un revenu fiscal de ${incomes}€ s'élève à ${taxable}€`;

DATA.innerHTML = read;


DATA.innerHTML = read; 