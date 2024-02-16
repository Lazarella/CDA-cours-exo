import axios from "axios";



const CRUD = () => {
    const URL_API = "http://localhost:5000/items/";

    const getItem = () => {
        axios.get(URL_API)
            .then(response => {
                console.log("Item details: ", response.data);
            })
            .catch(error => {
                console.error("Error: ", error);
            });
    }

    const getItemById = (id) => {
        axios.get(URL_API + id)
            .then(response => {
                console.log("Item details: ", response.data);
            })
            .catch(error => {
                console.error("Error: ", error);
            });
    }

    const deleteItem = (id) => {
        axios.delete(URL_API + id)
            .then(() => {
                console.log("Item with id " + id + " deleted");
            })
            .catch(error => {
                console.error("Error: ", error);
            });
    }

    const updateItem = (id, updatedData) => {
        axios.put(URL_API + id, updatedData)
            .then(() => {
                console.log("Item with id " + id + " updated");
            })
            .catch(error => {
                console.error("Error: ", error);
            });
    }

    const addItem = (newItem) => {
        axios.post(URL_API, newItem)
            .then(() => {
                console.log("Item added");
            })
            .catch(error => {
                console.error("Error: ", error);
            });
    }

    return {
        getItem,
        getItemById,
        deleteItem,
        updateItem,
        addItem
    };
}

export default CRUD