import client from './client'
import productList from './productList'
import { v4 as uuidv4 } from 'uuid'

export class order{
    constructor(id, client, productList){
        id = uuidv4();
        client = client.id; 
        productList = productList //variable à définir, renommer 
    }
}