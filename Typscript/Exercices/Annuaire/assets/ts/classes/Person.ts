console.log("test")

export class Person{
    private _id: number; 
    private _firstName: string;
    private _lastName: string; 
    private _dateOfBirth: Date;
    private _mail: string; 
    private _phone: number; 
    private _img: string; 

    constructor(firstName: string, lastName: string, dateOfBirth: Date, mail: string, phone: number, img: string){
        this._id = new Date().valueOf(); 
        this._firstName = firstName;
        this._lastName = lastName; 
        this._dateOfBirth = dateOfBirth; 
        this._mail = mail; 
        this._phone = phone; 
        this._img = img; 
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
        const currentDate = new Date();
        if(value > currentDate){
            this._dateOfBirth = value;
        }
    }
    get mail(){
        return this._mail;
    }
    set mail(value: string){
        if (value!== ""){
            this._mail = value;
        }
    }
        get phone(){
            return this._phone;
        }
        set phone(value: number){
            if (value !== null){
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