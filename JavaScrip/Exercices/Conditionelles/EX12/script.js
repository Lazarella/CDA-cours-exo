let read ="", 
nd1, 
nb2,
nbTest; 

const DATA = document.querySelector(".data"); 

nb1 = parseFloat(prompt(`Veuillez saisir un nombre`)); 
nb2 = parseFloat(prompt(`Veuillez saisir un autre nombre`));

if(nb1%nb2===0){
    read += `<p>Le nombre ${nb1} est divisible par ${nb2}</p>`; 
}else{
    read += `<p>Le nombre ${nb1} n'est <b>pas</b> divisible par ${nb2}</p>`; 
}

DATA.innerHTML = read; 
