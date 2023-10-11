import { useState, useEffect } from "react";
import Form from "./Form";

const Table = () => {
    const [myUsers, setMyUsers] = useState([]);
    let [counter, setCounter] = useState(0);  

    const addPersonToList = (newUser) => {
            setMyUsers([...myUsers, newUser])
            console.table(myUsers);
            setCounter(counter + 1)
    }
    return (
        <>
        <Form handleAddPerson={addPersonToList} />
        <table>
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Birthdate</th>
        </tr>
        </thead>
        <tbody>
        {myUsers.map((user, index) => (
            <tr key={index}>
            <td>{user.firstname}</td>
            <td>{user.lastname}</td>
            <td>{user.birthdate}</td>
            </tr>
        ))}
        </tbody>
    </table>
        <p>{counter < 1 ? "L'annuaire est vide" : counter === 1 ? "L'annuaire a une personne" : "L'annuaire a " + counter + " personnes"}</p>
        </>
    )
}

export default Table