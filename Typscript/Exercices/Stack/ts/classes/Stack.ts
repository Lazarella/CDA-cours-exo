export class Stack<T>{

    constructor(private itemsList : T[]){
    }
    public addItem(...items: T[]): T[]{
        this.itemsList.push(...items)
        console.table(this.itemsList);
        return this.itemsList
        
    }
    public removeItem(items: T): T[]{
        this.itemsList = this.itemsList.filter((element) => element !==items);
        console.table(this.itemsList);
        return this.itemsList 
    }
}
