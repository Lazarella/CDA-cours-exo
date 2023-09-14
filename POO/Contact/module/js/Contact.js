export class Contact{
    constructor(title, lastName, firstName, Age, phone, mail){
        this.title;
        this.lastName; 
        this.firstName; 
        this.Age; 
        this.phone; 
        this.mail;
    }
    display(){
        `
        <tr>
            <td>${this.title}</td>
            <td>${this.lastName}</td>
            <td>${this.firstName}</td>
            <td>${this.age}</td>
            <td>${this.phone}</td>
            <td>${this.mail}</td>
            </tr>
            `
    }
}