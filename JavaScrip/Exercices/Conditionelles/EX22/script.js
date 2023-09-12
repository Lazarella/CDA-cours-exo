let read ="";

const DATA = document.querySelector(".data"); 
read += `<h4>Menu et sous menu</h4>`

for(let i=1 ; i<=3 ; i++){
    read += `<h5>Chapitre ${i}</h5>`;
    for(let j=1 ; j<=3 ; j++){
    read += `<p>‣ Partie ${i}:${j}\n</p>` ;  
    }
}


DATA.innerHTML = read;
