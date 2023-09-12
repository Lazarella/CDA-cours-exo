let read ="", 
moyenne,
i=0,
total=0;
const etudiants = [ 
    { 
        prenom: "José", 
        nom: "Garcia", 
        matieres: { 
            francais: 16, 
            anglais: 7, 
            humour: 14 
        }  
    }, 
    { 
        prenom: "Antoine", 
        nom: "De Caunes", 
        matieres: { 
            francais: 15, 
            anglais: 6, 
            humour: 16, 
            informatique: 4, 
            sport: 10 
        } 
    } 
]; 

const DATA = document.querySelector(".data");

for(let etudiant of etudiants ){
    read += `<h6>${etudiant.nom} ${etudiant.prenom}</h6><ul>` ;
        for(let matiere in etudiant.matieres){
        read += `<li>${matiere} : ${etudiant.matieres[matiere]}/20</li>`
        total += etudiant.matieres[matiere];
        i++;
    }
    read += "</ul>"
    moyenne = total/i;
    read += `<p> Moyenne générale : ${(Math.round(moyenne*10))/10}/20`;
    }


DATA.innerHTML = read; 