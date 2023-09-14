import { Moto } from "./js/Moto.js";
import { Voiture } from "./js/Voiture.js";

const READ = document.querySelector(".read");

let voiture1 = new Voiture("Renault", "Kangoo", "240.000", 2003, true); 
let moto1 = new Moto("BMW", "R1150R Rockster", "65.000", 2005);

READ.innerHTML += voiture1.Display(); 
READ.innerHTML += moto1.Display(); 

