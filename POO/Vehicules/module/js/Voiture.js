import { Vehicule } from "./Vehicule.js";

export class Voiture extends Vehicule{
    constructor(brand, model, km, year, clim){
        super(brand, model, km, year, true)
        this.clim = clim;
        this.Display();   
    }
    Display(){
        if(this.clim = true){
        return `<p> <b>Voiture</b> : ${super.Display()} - Climatisée</p>`
        }else{
            return `Ce n'est pas une voiture ça`
        }
    }
}