import { useState } from "react"

const Form = (props) => {
    const [firstname, setFirstname] = useState(""); 
    const [lastname , setLastname] = useState (""); 
    const [birthdate, setBirthdate] = useState (Date); 
    
const getFirstname = (event) =>{
    setFirstname(event.target.value)
}
const getLastname = (event) =>{
    setLastname(event.target.value)
}
const getBirthday = (event) =>{
    setBirthdate(event.target.value)
}

const handleAddPerson = () => {

    const newUser = {
        firstname,
        lastname,
        birthdate,
    };

    props.handleAddPerson(newUser);

    setFirstname("");
    setLastname("");
    setBirthdate("");
};

return (
    <>
    <input type="text" onInput={getFirstname} value={firstname}/>
    <input type="text" onInput={getLastname} value={lastname}/>
    <input type="date" onInput={getBirthday} value={birthdate}/>
    <button onClick={handleAddPerson}>Add Person</button>
    </>
)
}

export default Form