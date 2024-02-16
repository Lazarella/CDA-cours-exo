import { Vehicule } from "./Vehicule.js";

export class Moto extends Vehicule{
    constructor(brand, model, km, year){
        super(brand, model, km, year)
        this.Display();
    }
    Display(){
            return `<p> <b>Moto</b> : ${super.Display()} </p>`
    }
}