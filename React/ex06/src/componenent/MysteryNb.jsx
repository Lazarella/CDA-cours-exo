import { useState } from "react"

const MysteryNb = ({mysteryValue = 12}) =>{

const [numberA, setNumberA] = useState(0); 
const [numberB, setNumberB] = useState(0); 

const getData = (event) => {
    setNumberA (event.target.value)
    setNumberB (event.target.value)
}



return(
    <>
    <div>
    <input type="text" value={numberA} onInput={getData} />
    <input type="text" value={numberB} onInput = {getData}/>    
    </div>
    <div id="screen"></div>
    </>
)
}

export default MysteryNb