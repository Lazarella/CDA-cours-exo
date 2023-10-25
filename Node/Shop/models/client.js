import { v4 as uuidv4 } from 'uuid'

export class Client {
    constructor(id, firstname, lastname, phone){
        this.id = id || uuidv4(); 
        this.firstname = firstname; 
        this.lastname = lastname; 
        this.phone = phone 
    }

}