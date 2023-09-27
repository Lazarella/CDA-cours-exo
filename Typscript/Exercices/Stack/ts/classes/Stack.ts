export class Stack<T>{

    constructor(public itemsList : T[]){
    }
    addItem(...items: T[]): T[]{
        this.itemsList.push(...items)
        console.table(this.itemsList);
        return this.itemsList
        
    }
    removeItem(item: T): T[]{
        this.itemsList = this.itemsList.filter((element) => element !== item);
        console.table(this.itemsList);
        return this.itemsList 
    }
}
