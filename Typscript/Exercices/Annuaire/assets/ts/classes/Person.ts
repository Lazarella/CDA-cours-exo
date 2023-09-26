console.log("test")

export class Person{
    private _firstName: string;
    private _lastName: string; 
    private _dateOfBirth: Date;
    private _mail: string; 
    private _phone: string; 
    private _img: string; 
    private static getId = new Date().valueOf(); 
    private _id : number; 

    constructor(firstName: string, lastName: string, dateOfBirth: Date, mail: string, phone: string, img: string){
        this._firstName = firstName;
        this._lastName = lastName; 
        this._dateOfBirth = dateOfBirth; 
        this._mail = mail; 
        this._phone = phone; 
        this._img = img; 
        this._id = Person.getId;
    }
    get firstname() {
        return this._firstName
    }
    
    set firstname(value: string) {
        if (value !== "") {
        this._firstName = value
        }
    }
    get lastName(){
        return this._lastName
    }
    set lastName(value: string){
        if(value !==""){
            this._lastName = value;
        }
    }
    get dateOfBirth(){
        return this._dateOfBirth; 
    }
    set dateOfBirth(value: Date){
            this._dateOfBirth = value;
    }
    get age() : number{
        const today = new Date(); 
        const todaycopy = new Date(); 
        todaycopy.setFullYear(this._dateOfBirth.getFullYear())
        if(todaycopy< this._dateOfBirth){
            return today.getFullYear() - this._dateOfBirth.getFullYear() - 1; 
        }else{
            return today.getFullYear() - this._dateOfBirth.getFullYear(); 
            

        }
    }
    get mail(){
        return this._mail;
    }
    set mail(value: string){
            this._mail = value;
    }
        get phone(){
            return this._phone;
        }
        set phone(value: string){
            if (value !== ""){
                this._phone = value
            }
        }
        get img(){
            return this._img; 
        }
        set img (value: string){
            if (value!==""){
                this._img = value;
            }else{
                this._img = "https://thispersondoesnotexist.com"
            }
        }
}