let read ="";


const DATA = document.querySelector(".data"); 
read += `<h4>Les table de multiplication de 1 à 10 </h4>`

for(let i=1 ; i<=10 ; i++){
    read += `<div class= "col-4 col card p-3 m-2" style=" width: 13rem;"><h5>Table de ${i} : </h5>`;
    for(let j=1 ; j<=10 ; j++){
    read += `<p>   ‣ ${i} x ${j} = ${i*j}</p>` ;  
    }
    read +=`</div>`
}


DATA.innerHTML = read;


