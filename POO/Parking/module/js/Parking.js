import { Vehicule} from "./Vehicule.js";

export class Parking {
    constructor(){
        this.vehicules = [];
        this.client = ""; 
    }

    addVehicule(text){
        const vehicule = new Vehicule(text); 
        vehicule.start();
        this.vehicules.push(vehicule);
        console.table(this.vehicules);
    }
    leaveParking(){
        const client = this.vehicules.find((t)=>t.immatriculation == immatriculation);
        console.log("this is the car I want to bill : "+ client); 
        if (!client){
            setTimeout(() => {
            const message = document.createElement('div'); 
            message.className ='text-center '; 
            message.textContent = `Le véhicule ${client} n'est pas dans ce parking`;
                //console.log("3 sercondes plus tard")
                //console.log(new Date())   
            },5000);

            if(client.enter && client.out){

                let timeBill = client.enter-client.out ;
                let bill = 0;
                switch (timeBill) { 
                    case timeBill <= (15*60)*1000 :
                        bill = 0.8;
                        break; 
                        case (15*60)*1000 < timeBill <= (15*60)*1000 :
                            bill = 1.30;
                            break;
                            case (30*60)*1000 < timeBill <= (45*60)*1000 :
                                
                                bill = 1.70; 
                                break; 
                                case timeBill > (45*60)*1000 : 
                                bill = 6; 
                                break; 
                                default : 
                                bill = "000"; 
                                break; 
                                const message = document.createElement('div'); 
                                message.className ='text-center '; 
                                message.textContent = `Le prix à payer pour ${client} est de ${bill}€`; 
                                delete this.client; 
                                return message
                            }
                        }
            }
        }
    }
