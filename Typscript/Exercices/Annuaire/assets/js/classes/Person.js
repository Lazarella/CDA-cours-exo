console.log("test");
export class Person {
    constructor(firstName, lastName, dateOfBirth, mail, phone, img) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._dateOfBirth = dateOfBirth;
        this._mail = mail;
        this._phone = phone;
        this._img = img;
        this._id = Person.getId;
    }
    get firstname() {
        return this._firstName;
    }
    set firstname(value) {
        if (value !== "") {
            this._firstName = value;
        }
    }
    get lastName() {
        return this._lastName;
    }
    set lastName(value) {
        if (value !== "") {
            this._lastName = value;
        }
    }
    get dateOfBirth() {
        return this._dateOfBirth;
    }
    set dateOfBirth(value) {
        this._dateOfBirth = value;
    }
    get age() {
        const today = new Date();
        const todaycopy = new Date();
        todaycopy.setFullYear(this._dateOfBirth.getFullYear());
        if (todaycopy < this._dateOfBirth) {
            return today.getFullYear() - this._dateOfBirth.getFullYear() - 1;
        }
        else {
            return today.getFullYear() - this._dateOfBirth.getFullYear();
        }
    }
    get mail() {
        return this._mail;
    }
    set mail(value) {
        this._mail = value;
    }
    get phone() {
        return this._phone;
    }
    set phone(value) {
        if (value !== null) {
            this._phone = value;
        }
    }
    get img() {
        return this._img;
    }
    set img(value) {
        if (value !== "") {
            this._img = value;
        }
        else {
            this._img = "https://thispersondoesnotexist.com";
        }
    }
}
Person.getId = new Date().valueOf();
