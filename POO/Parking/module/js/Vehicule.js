export class Vehicule{
    constructor(immatriculation){
        this.immatriculation = immatriculation;
        this.enter = new Date();
        this.out = new Date();
    }
    start(){
        const btnIn = document.querySelector('#ticket'); 
        btnIn.addEventListener('click', (e)=>{
        this.enter = new Date(); 
        })
    }
    end(){
        const btnIn = document.querySelector('#payUp'); 
        btnIn.addEventListener('click', (e)=>{
        this.out = new Date(); 
        })
        
    }
}