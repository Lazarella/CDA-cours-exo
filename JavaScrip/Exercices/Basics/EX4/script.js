

const word = prompt("Veuillez entrez un mot pour savoir si c'est un palindrome ||ヽ(*￣▽￣*)ノミ|Ю") 

const reversedWord = word.split('').reverse().join('');

function checkPalindrom(a, b){
    if (a===b){
        return `Le mot ${a} est un palindrome`
    }else{
        return `Le mot ${a} n'est pas un palindrome`
    }

}


const DATA = document.querySelector(".data"); 
DATA.innerHTML = (`Vous avez saisi : <b>${word}</b><br>Le mot inversé : <b>${reversedWord}</b><br>${checkPalindrom(word, reversedWord)}`);
