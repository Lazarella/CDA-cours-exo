export class Person {
    private static _count: number =0;
    private _id: number;
    private _firstname: string;
    private _lastname
    private _age: number; 
    readonly numeroIdNat: number;

    constructor(firstname:string, lastname: string, age:number, numeroIdNat: number){
        this._id = ++Person._count
        this._firstname = firstname
        this._lastname = lastname
        this._age = age
        this.numeroIdNat = numeroIdNat
    }
}