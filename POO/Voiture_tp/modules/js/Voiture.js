export class Voiture{
    constructor(marque, serie, vitesse){
        this.marque = marque; 
        this.serie = serie; 
        this.vitesse = vitesse
    }
    Faster(a){
        this.vitesse += 10 * a;
        console.log(`La ${this.marque} accélère ${a} fois`) 
        console.log(`La ${this.marque} roule a ${this.vitesse} km/h`);
    }
    Turn(a){
        this.vitesse -= 5*a;
        console.log(`La ${this.marque} tourne ${a} fois`)
        console.log(`La ${this.marque} roule a ${this.vitesse} km/h`);
    }
}