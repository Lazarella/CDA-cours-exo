let read ="",
nbUser, 
sum
;

const DATA = document.querySelector(".data")

nbUser = parseInt(prompt("Veuillez entrer un nombre entier et laissez la magie opérer ( •̀ ω •́ )✧"));

read+= `<p>Vous avez saisi le nombre ${nbUser}</p>`

if (!isNaN(nbUser)){

    read += `<p>Voici la liste d'entiers chaînés dont la somme est égale à <b>${nbUser}</b> :</p><ul>`;
    let i = 1; 
    while(i<= nbUser/2 + 1){
        let sum=i;
        let chain = nbUser +" = "+i;
        let j = i + 1; 
        while(j <= nbUser/2 + 1){
            sum +=j
            chain +="+"+j;
                if (sum==nbUser){
                    read += `<li>${chain}</li>`;
                    break;
                }
                else if(sum  >nbUser)
                    break;
                    j++; 
                
        }
        i++;
    }
    read += `</ul>`;
}

DATA.innerHTML = read; 