import { useRef, useState, useEffect } from 'react'
import Contact from '../Model/Contact';

const ContactForm =(props)=> {

    const usernameInputRef = useRef(); 
    const usermailInputRef = useRef() 
    const [userName, setUserName] = useState(''); // State for username
    const [mail, setMail] = useState('');
    const [canSubmit, setCanSubmit] = useState(false)

    
    const onInputChanged =(event)=>{
        
        const userName = usernameInputRef.current.value; 
        const mail = usermailInputRef.current.value; 
        setUserName(userName);
        setMail(mail);
        
        usernameInputRef.current.value = '';
        usermailInputRef.current.value = '';
    }
    
    useEffect(() => {
        setCanSubmit(!!userName && !!mail); 
    }, [userName, mail]);

    const submitFormHandler = (event) => {
        event.preventDefault();
        const newContact = props.onAdd(new Contact(userName, mail));
        props.contactInfos(newContact);
        usernameInputRef.current.value = '';
        usermailInputRef.current.value = '';
        setUserName(''); 
        setMail('');
    }

    return(
<form action="#" onSubmit={submitFormHandler} >
    <div>
        <label htmlFor="userName"> Nom ou Surnom </label>
        <input type="text" ref={usernameInputRef} id='userName' onInput={(e) => onInputChanged(e, 'userName')} required/>
    </div>
    <div>
    <label htmlFor="userMail" >Mail</label>
    <input type="mail" ref={usermailInputRef} id='userMail' onInput={(e) => onInputChanged(e, 'mail')} required/>
    </div>
    <hr />
    <button disabled={!canSubmit} className='btn btn-succes'>Valider</button>
</form>
    )

}

export default ContactForm