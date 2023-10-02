import { useState } from "react";

const ListingComponent=(props)=>{

    const [listeningP, setListingP] =useState([])
    const [inputValue, setInputVAlue] = useState(""); 

    const addToList =()=>{
setListingP([...listeningP,inputValue]);
console.table(setListingP);
    }

    const editInput =(event)=>{
        setInputVAlue(event.target.value)
    }
    return(
        <>
        <input type="text" placeholder="Enter le nom de votre hero" value={inputValue} onInput={(editInput)} />
        <hr />
        <ul>
            {listeningP.map((name, index)=><li key= {index}>{name}</li>)}
        </ul>
        <hr />
        <button onClick={addToList}>Adding hero</button>
        </>
    )


}

export default ListingComponent; 

