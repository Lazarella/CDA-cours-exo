// import { useParams, useSearchParams} from "react-router-dom"
import {Link} from 'react-router-dom'
import ContactForm from './ContactForm'
import { useState } from 'react'


const Contact =(props)=>{
    const { contacts, onAddContact } = props
    const [listContact, setListContact] = useState([])

    
    const handleAddContact = (newContact) => {
    // Perform any necessary validation here
    if (!newContact.name || !newContact.mail) {
      // Handle validation error, e.g., display an error message
        return;
    }

    // Add the new contact to the contacts array
    setListContact((prevContacts) => [...prevContacts, newContact]);
};

    if (contacts && contacts.length > 0) {
        return (
            <table >
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Prénom</th>
                        <th>Nom</th>
                        <th>Date de naissance</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {contacts.map(contact => (
                        <tr key={contact.id}>
                            <td>{contact.id}</td>
                            <td>{contact.firstname}</td>
                            <td>{contact.lastname}</td>
                            <td>{contact.birthdate}</td>
                            <td>N/A</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        )
    } else {
        return (
            <>
            <p>
                Il n'y a pas de contacts dans la base de données !
            </p>
<Link to='/contact/form'>Rejoingnez nous!</Link>
<ContactForm onAdd={handleAddContact} />
            </>
        )
    }
}


export default Contact

