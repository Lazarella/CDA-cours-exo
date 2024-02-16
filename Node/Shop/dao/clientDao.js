import {readFileSync, writeFileSync} from 'fs';  
import { resolve } from 'path'
import { v4 as uuidv4 } from 'uuid'


export class ClientDao{
    constructor(){
        this.file = resolve("./data/clientDb.json"); 
        this.clients = []; 
    }
    
    readFile(){
        const file = readFileSync(this.file, { encoding : 'utf-8'}); 
        this.clients = JSON.parse(file); 
    }

    writeFile(){
        writeFileSync(this.file, JSON.stringify(this.clients));
    }

    getAll(){
        return this.clients; 
    }

    save(client){
        const id = uuidv4(); 
        this.clients.push(client); 
        this.writeFile();    
    }

    findById(id){
        return this.clients.find((c)=> c.id == id); 
    }

    deleteClient(id){
        this.clients.filter((c)=> c.id == id);
        this.writeFile(); 
    }

    updateClient(clientToUpdate){
        const client = this.findById(clientToUpdate.id); 
        if (todo == undefined){
            console.log('this client cannot be find');
            return false 
        }
        client.firstname = clientToUpdate.firstname; 
        client.lastname = clientToUpdate.lastname; 
        client.phone = clientToUpdate.phone; 

        this.writeFile(); 
        console.log('this client informations are up to date');
        return true; 
    }


}