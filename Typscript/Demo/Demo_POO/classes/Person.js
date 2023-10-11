export class Person {
    constructor(firstname, lastname, age, numeroIdNat) {
        this._id = ++Person._count;
        this._firstname = firstname;
        this._lastname = lastname;
        this._age = age;
        this.numeroIdNat = numeroIdNat;
    }
}
Person._count = 0;
