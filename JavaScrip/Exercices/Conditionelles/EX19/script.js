let read ="", 
userSize, 
userWeigth;


const DATA = document.querySelector(".data"); 

userSize = parseInt(prompt(`Veuillez entrer votre taille (en cm)`)); 
userWeigth = parseInt(prompt(`Veuillez entrer votre poids (en kg)`));

switch(true){
    case 166<userSize>183 && 47<userWeigth>54:
        read = `<p>Pour ${userSize}cm et ${userWeigth}kg :</p><p>▸ Prenez la taille 2</p>`; 
        break;
    case 163<userSize>178 && 53<userWeigth>60:
        read = `<p>Pour ${userSize}cm et ${userWeigth}kg :</p><p>▸ Prenez la taille 2</p>`; 
        break;
    case 160<userSize>175 && 59<userWeigth>66:
        read = `<p>Pour ${userSize}cm et ${userWeigth}kg :</p><p>▸ Prenez la taille 2</p>`; 
        break;
    case 157<userSize>172 && 65<userWeigth>72:
        read = `<p>Pour ${userSize}cm et ${userWeigth}kg :</p><p>▸ Prenez la taille 2</p>`; 
        break;

}
DATA.innerHTML = read; 