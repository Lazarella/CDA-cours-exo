function myButtonClick(){
    alert("Vous avez cliqué sur le bouton, vilain !!! ヽ（≧□≦）ノ !!!")
}

function myMouseOver(){
    alert("Vous avez survolé sur le bouton, ça c'est ok")
}

function myDbClick(){
    alert ("Vous avez double cliqué! MONSTRE!")
}

function myFunctionAlert(arg){
    switch(arg){
        case 1 : alert("Vous avez cliqué sur le bouton 1"); break;
        case 2 : alert("Vous avez cliqué sur le bouton 2"); break;
        case 3 : alert("Vous avez cliqué sur le bouton 3"); break;
        case 4 : alert("Vous avez cliqué sur le bouton 4"); break;
        default : alert("hey!"); break; 
    }
}

document.addEventListener("keydown",(event)=>{
    if (event.key == 'Enter'){
        alert("Vous avez appuyé sur Entrer!!! Oh Humanity!!!"
        + document.querySelector('#keyup').value)
    }
})

document.addEventListener("click", (event)=>{
    let valeur = event.target.dataset.key; 
    alert(valeur);
})

