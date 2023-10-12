import axios from 'axios';

class Item {
    constructor(id, title, price, description, img) {
        this._id = id;
        this._title = title;
        this._price = price;
        this._description = description;
        this._img = img;
    }


    get id() {
        return this._id;
    }

    get title() {
        return this._title;
    }

    get price() {
        return this._price;
    }

    get description() {
        return this._description;
    }

    get img() {
        return this._img;
    }

    set id(id) {
        this._id = id;
    }

    set title(title) {
        this._title = title;
    }

    set price(price) {
    this._price = price;
    }

    set description(description) {
    this._description = description;
    }

    set img(img) {
    this._img = img;
    }

    getItem (id) {
        axios.get(`http://localhost:5000/item/${id}`)
        .then(response=>{
            console.log("Item details ",response.data);
        })
        .catch(error => {
            console.error("Error : ", error);
        })
}

    deleteItem (id) {

    axios.delete(`http://localhost:5000/item/${id}`)
    .then(() => {
    console.log("item with id "+id+" supprimer")
    })
    .catch(error => {
    console.error("Erreur : ",error)
    })

}

updateItem(id){

    axios.put(`http://localhost:5000/item/${id}`)
    .then(() => {
    console.log("item with id "+id+" supprimer")
    })
    .catch(error => {
    console.error("Erreur : ",error)
    })

}

addItem(newItem){

    axios.post(`http://localhost:5000/item/`, newItem)
    .then(() => {
    console.log("Item added")
    })
    .catch(error => {
    console.error("Erreur : ",error)
    })

}
}

export default Item 


