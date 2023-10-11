"use strict";
class Stack {
    constructor(itemsList) {
        this.itemsList = itemsList;
    }
    stacking(item) {
        this.itemsList.push(item);
        console.table(this.itemsList);
        return this.itemsList;
    }
    remove(item) {
        this.itemsList = this.itemsList.filter((element) => element !== item);
        console.table(this.itemsList);
        return this.itemsList;
    }
}
