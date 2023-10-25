import {v4 as uuidv4} from 'uuid'


export class product {
    constructor(id, title, price, stock){
        id = uuidv4()
        this.title = title
        this.price = price
        this.stock = stock
    }
}