import { useState } from "react"

const Form =()=>{

    const [title, setTitle] = useState(""); 
    const [description, setDescription] = useState (""); 
    const [date, setDate] = useState (Date); 

    
    const upDateHandler =()=>{
        setTitle(title)
        console.log(title);
        setDescription(description)
        setDate(date)
    }


return (
    <form action="#">
        <label htmlFor="title" className="form-label p-2">Nom</label>
        <input type="text" placeholder="Conquérir le monde" id="title" value={title} className="form-control" onChange={upDateHandler}/>
        <label htmlFor="description">Description</label>
        <input type="text" placeholder="Décrivez votre projet ici" id="description" value={description} className="form-control"onChange={upDateHandler}/>
        <label htmlFor="date">A finir avant le : </label>
        <input type="date" id="date" value={date} className="form-control" onChange={upDateHandler}/>
        
    </form>
)

}

export default Form