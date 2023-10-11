import { Person } from "./classes/Person.js"
import { PersonList } from "./classes/PersonList.js";
console.log("test")


const personList = new PersonList([]); // creating an array of person



//Getting what I need from the DOM : 

const userFirstnameInput = document.getElementById("userFirstname") as HTMLInputElement;
const userLastnameInput = document.getElementById("userLastname") as HTMLInputElement;
const userBirthdateInput = document.getElementById("userBirthdate") as HTMLInputElement;
const userMailInput = document.getElementById("userMail") as HTMLInputElement;
const userPhoneInput = document.getElementById("userPhone") as HTMLInputElement;
const userAvatarInput = document.getElementById("userAvatar") as HTMLInputElement;
const AddButton = document.getElementById("addBTN") as HTMLButtonElement;


AddButton.addEventListener('click', ()=>{
const firstName = userFirstnameInput.value; 
const lastName = userLastnameInput.value; 
const birthdate = userBirthdateInput.value;
const mail = userMailInput.value; 
const phone = userPhoneInput.value; 
const avatar = userAvatarInput.value;

const newPerson = new Person( firstName, lastName, new Date( birthdate), mail, phone, avatar);

personList.addPerson(newPerson);
const people  = document.createElement('div') as HTMLDivElement
people.textContent = newPerson.firstname + newPerson.lastName
const contactList = document.getElementById("myContacts") as HTMLDivElement
contactList.appendChild(people);
});

// if ( person.id=!null){
//     personList.addPerson(new person); 
    
// }