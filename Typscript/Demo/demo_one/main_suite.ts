enum STATUS{
    CADRE, 
    SALARIE, 
    COMMERCIAL,
    BLABLA
}

let myStatusC = STATUS.CADRE
let myStatusD : STATUS = 2
let myStatusE = STATUS[2]

console.log(myStatusC);
console.log(myStatusD);
console.log(myStatusE);

let myObjectWithEnum ={
    name :"Toto", 
    role : STATUS.COMMERCIAL, 
    isCommercial: function():boolean {return this.role === STATUS.COMMERCIAL}
}

console.log('Mon utilisateur est un commercial ?' + myObjectWithEnum.isCommercial());

// Type Any 

const myFonction =(arg:any): void =>{
console.log(arg.length);
}

myFonction("Bonjour")
myFonction(3)

// Type Unknow 

console.log("##### UNKNOW #####");

let str : unknown; 
let strAny:any; 
let hello : string = "Bonjour"; 
let myNumbrer : number = 42; 

str = hello; // fonctionne aussi avec myNumber
strAny = hello; // fonctionne aussi avec myNumber

// console.log(str.length); impossible d'appliquer des méthodes en unknow

console.log("strAny"+strAny.length); // le type necessaire est attribué
console.clear()

if (typeof str == 'string'){
    console.log(str.length); // str est de type string
    console.log(typeof str);
}else{
    console.log(str);
    console.log(typeof str);
}