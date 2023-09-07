/*

Les opérateurs arithmétiques

*/

let nb1=10, nb2=65, result;

// Addition

result=nb1+nb2;
console.log(`${nb1}+${nb2}=${result}`);

// Soustraction 

result=nb1-nb2;
console.log(`${nb1}-${nb2}=${result}`);


//Multiplication

result=nb1*nb2;
console.log(`${nb1}*${nb2}=${result}`);


// Division

result=nb1/nb2;
console.log(`${nb1}/${nb2}=${result}`);

// Modulo

result=nb1%nb2;
console.log(`${nb1}%${nb2}=${result}`);

// Opérateur d'incrémentation

console.log(`Opérateurs d'incrémentation`);

// Incrémentation

nb1 = nb1+1; // Incrémentation classique 
console.log(nb1);
nb1 += 1; // Opérateur combiné +=
console.log(nb1);
nb1++; // Opérateur d'incrémentation 
console.log(nb1);

// Décrémentation

nb1 = nb1-1;  
console.log(nb1);
nb1 -= 1; 
console.log(nb1);
nb1--;
console.log(nb1);

console.log("************");
// Incrément puis lecture de la valeur 
console.log(++nb1);
//Lecture de la valeur puis incrémentation 
console.log(nb1++);

// Multiplication combinée
console.log(nb2*=nb1);
// Division combinée 
console.log(nb2/=nb1);