
let contactCount = 0 

class Contact {

   
    constructor(name, mail, id = null) {
        this._id = ++contactCount
        this._name = name; 
        this._mail = mail; 
    }

    get name() {
        return this._name;
    }

    set name(value) {
        
        this._name = value;
    }

    get mail() {
        return this._mail;
    }

    set mail(value) {
        
        this._mail = value;
    }

    get id() {
        return this.id;
    }
}

export default Contact;

