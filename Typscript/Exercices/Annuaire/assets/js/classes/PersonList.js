export class PersonList {
    constructor(personneList) {
        this._personList = [];
        this._personList = personneList;
    }
    get personList() {
        return this._personList;
    }
    set personList(value) {
        this._personList = value;
    }
    addPerson(newPerson) {
        this._personList.push(newPerson);
    }
    editPerson(personId, updatedInfo) {
        for (let i = 0; i < this._personList.length; i++) {
            if (personId === this._personList[i].id) {
                this._personList[i] = Object.assign(Object.assign({}, this._personList[i]), updatedInfo);
                break;
            }
        }
    }
    deletePerson(personId) {
        const index = this._personList.findIndex(person => person.id === personId);
        if (index !== -1) {
            this._personList.splice(index, 1);
        }
    }
    displayPerson() {
    }
}
