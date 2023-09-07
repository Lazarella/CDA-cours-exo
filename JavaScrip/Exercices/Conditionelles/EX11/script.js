let read="", 
userLetter,
userLetterRaw;  

const DATA = document.querySelector(".data"); 

userLetterRaw = prompt(`Veuillez entrer une lettre`)
userLetter = userLetterRaw.toLowerCase();

if(userLetter==="a"||
    userLetter==="à"||
    userLetter==="e"||
    userLetter==="é"||
    userLetter==="è"||
    userLetter==="ê"||
    userLetter==="ë"||
    userLetter==="i"||
    userLetter==="î"||
    userLetter==="ï"||
    userLetter==="o"||
    userLetter==="u"||
    userLetter==="ù"||
    userLetter==="y")
    { 
    read += `La lettre <b>${userLetter}</b> est une voyelle`;
}
else if(
    userLetter==="b"||
    userLetter==="c"||
    userLetter==="ç"||
    userLetter==="d"||
    userLetter==="f"||
    userLetter==="g"||
    userLetter==="h"||
    userLetter==="j"||
    userLetter==="k"||
    userLetter==="l"||
    userLetter==="m"||
    userLetter==="n"||
    userLetter==="p"||
    userLetter==="q"||
    userLetter==="r"||
    userLetter==="s"||
    userLetter==="t"||
    userLetter==="v"||
    userLetter==="w"||
    userLetter==="x"||
    userLetter==="z") // just "else" is enought 
{
    read += `La lettre <b>${userLetter}</b> n'est pas une voyelle`;
}

// .includes is a cleaner and faster option

DATA.innerHTML = read; 