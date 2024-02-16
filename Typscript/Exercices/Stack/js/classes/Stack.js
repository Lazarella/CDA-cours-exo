export class Stack {
    constructor(itemsList) {
        this.itemsList = itemsList;
    }
    addItem(...items) {
        this.itemsList.push(...items);
        console.table(this.itemsList);
        return this.itemsList;
    }
    removeItem(items) {
        this.itemsList = this.itemsList.filter((element) => element !== items);
        console.table(this.itemsList);
        return this.itemsList;
    }
}
