import Item from './item'; // Import the Item class

class ItemList {
    constructor() {
        this.items = [];
    }

    addItem(id, title, price, description, img) {
        const newItem = new Item(id, title, price, description, img);
        this.items.push(newItem);
    }

    removeItem(itemId) {
        this.items = this.items.filter(item => item.id !== itemId);
    }

    getItemById(itemId) {
        return this.items.find(item => item.id === itemId);
    }

    getAllItems() {
        return this.items;
    }
}

export default ItemList;
