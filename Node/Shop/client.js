import express from 'express'
import { ClientDao } from './dao/clientDao.js'
import { Client } from './models/client.js'


const myClient = express.Router(); 

const clientDao = new ClientDao();
clientDao.readFile(); 

myClient.use(express.json()); 

myClient.get('/', (req, res)=> {
    res.json(clientDao.getAll());
})

myClient.get('/:clientID', (req,res)=>{
    let client = clientDao.findById(req.params.clientID); 

    if(client == undefined){
        res.status(404).json({
            code: 404, message: "oups, no client found with this id"
        })
    }

    res.json(client)
}
)

myClient.post('/', (req,res)=>{
    const {firstname, lastname, phone} = req.body; 
    let client = new Client(null, firstname, lastname, phone); 
    res.json(clientDao.save(client))
})

// app.listen(3031, ()=>{
//     clientDao.readFile();
//     console.log("We are currently listening to the soft http://127.0.0.1:3031, the grooviest port");
// })

export default myClient