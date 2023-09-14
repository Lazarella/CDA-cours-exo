export class Vehicule{
    constructor(brand, model, km, year){
        this.brand = brand;
        this.model = model; 
        this.km = km; 
        this.year = year;
    }
    Display(){
    return ` ${this.brand} - ${this.model} - ${this.km}km -${this.year}`
    }
}