import { Voiture} from "./js/Voiture.js";

let voiture1 = new Voiture("Bmw", "Série 1", 80);
let voiture2 = new Voiture("Mercedes", "GBL", 100);

console.log(voiture1.marque);
console.log(voiture2.marque);

voiture1.Faster(3) 
voiture2.Faster(2)
voiture2.Turn(2); 

