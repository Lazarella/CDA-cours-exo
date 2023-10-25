import express from 'express'
import { ClientDao } from './dao/clientDao.js'
// import { Client } from './models/client.js'
import { resolve } from 'path'
import myClient from './client.js'

const app = express(); 

export const clientDao = new ClientDao()

export const clientDb = resolve("./data/clientDb.json")

app.use("/clients", myClient)


app.listen(3031, ()=>{
    clientDao.readFile();
    console.log("We are currently listening to the soft http://127.0.0.1:3031, the grooviest port");
})