import { Person } from "./Person";

export class PersonList{
    private _personList = [];
    constructor(personneList: []){
        this._personList = personneList; 
    } 
    get personList(){
        return this._personList
    }
    set personList (value){
                this._personList= value;
    }
    addPerson(newPerson: Person){    // Add new a person to the List
        this._personList.push(newPerson);
        
    } 
    editPerson(personId: number, updatedInfo: Partial<Person>){ // Update informations for one person of the list
        for(let i : number = 0; i< this._personList.length; i++){
            if(personId === this._personList[i].id){
                this._personList[i] = { ...this._personList[i], ...updatedInfo };
                break; 
            }
        }
    }   
    deletePerson(personId: number) {  //Remove one person from the List
        const index = this._personList.findIndex(person => person.id === personId);

        if (index !== -1) {
            this._personList.splice(index, 1);
        }
    }
    displayPerson(){

    }
}
