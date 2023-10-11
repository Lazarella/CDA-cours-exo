import { useState } from "react";

const SayMyName = ()=>{

    const [firstname, setFirstname] = useState("Jane");
    const [lastname, setLastname] = useState("Calmant");

    const changeFirstname =(event)=>{
        setFirstname(event.target.value)
    }
    const changeLastname = (event) => {
        setLastname(event.target.value)
        console.log(event.target.value);
    }
    return (
        <>
            <h1 className="display-4">Say my name with a Hook</h1>
            <hr />
            <div className="container m-3 p-3 align-center">
                
            {/* <label htmlFor="firstName">Your firstname</label> */}
            <input type="text" onInput={changeFirstname} id="firstName" placeholder="Bob" value={firstname}/>
            {/* <button onClick={changeFirstname} className="btn btn-outline-info">Your firstname</button> */}
            {/* <label htmlFor="lastName">Your lastname</label> */}
            <input type="text" onInput={changeLastname} id="lastName" placeholder="Moran" value={lastname}/>
            {/* <button onClick={changeLastname} className="btn btn-outline-info">Your lastname</button> */}
            <hr />
            </div>
            <h4 className="display-6">Be a hero <b>{firstname.toUpperCase()} {lastname.toUpperCase()}</b></h4>
        </>
        
    )
}

export default SayMyName