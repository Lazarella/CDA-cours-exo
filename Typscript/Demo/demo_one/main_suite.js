"use strict";
var STATUS;
(function (STATUS) {
    STATUS[STATUS["CADRE"] = 0] = "CADRE";
    STATUS[STATUS["SALARIE"] = 1] = "SALARIE";
    STATUS[STATUS["COMMERCIAL"] = 2] = "COMMERCIAL";
    STATUS[STATUS["BLABLA"] = 3] = "BLABLA";
})(STATUS || (STATUS = {}));
let myStatusC = STATUS.CADRE;
let myStatusD = 2;
let myStatusE = STATUS[2];
console.log(myStatusC);
console.log(myStatusD);
console.log(myStatusE);
let myObjectWithEnum = {
    name: "Toto",
    role: STATUS.COMMERCIAL,
    isCommercial: function () { return this.role === STATUS.COMMERCIAL; }
};
console.log('Mon utilisateur est un commercial ?' + myObjectWithEnum.isCommercial());
// Type Any 
const myFonction = (arg) => {
    console.log(arg.length);
};
myFonction("Bonjour");
myFonction(3);
// Type Unknow 
console.log("##### UNKNOW #####");
let str;
let strAny;
let hello = "Bonjour";
let myNumbrer = 42;
str = hello; // fonctionne aussi avec myNumber
strAny = hello; // fonctionne aussi avec myNumber
// console.log(str.length); impossible d'appliquer des méthodes en unknow
console.log("strAny" + strAny.length); // le type necessaire est attribué
console.clear();
if (typeof str == 'string') {
    console.log(str.length); // str est de type string
    console.log(typeof str);
}
else {
    console.log(str);
    console.log(typeof str);
}
