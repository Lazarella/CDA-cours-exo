import { Person } from "./classes/Person.js";
import { PersonList } from "./classes/PersonList.js";
console.log("test");
const personList = new PersonList([]); // creating an array of person
//Getting what I need from the DOM : 
const userFirstnameInput = document.getElementById("userFirstname");
const userLastnameInput = document.getElementById("userLastname");
const userBirthdateInput = document.getElementById("userBirthdate");
const userMailInput = document.getElementById("userMail");
const userPhoneInput = document.getElementById("userPhone");
const userAvatarInput = document.getElementById("userAvatar");
const AddButton = document.getElementById("addBTN");
AddButton.addEventListener('click', () => {
    const firstName = userFirstnameInput.value;
    const lastName = userLastnameInput.value;
    const birthdate = userBirthdateInput.value;
    const mail = userMailInput.value;
    const phone = userPhoneInput.value;
    const avatar = userAvatarInput.value;
    const newPerson = new Person(firstName, lastName, birthdate, mail, phone, avatar);
    personList.addPerson(newPerson);
    const people = document.createElement('div');
    people.textContent = newPerson.firstname + newPerson.lastName;
    const contactList = document.getElementById("myContacts");
    contactList.appendChild(people);
});
// if ( person.id=!null){
//     personList.addPerson(new person); 
// }
