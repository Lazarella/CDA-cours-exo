import { useContext } from "react"
import { CardContext } from "../contexts/cardContext"
import AddForm from "./addForm"

const DisplayCard = () =>{
    const [_, setLog] = useContext(CardContext)

const itemLog = () => {
    setLog(console.log("this should be my card info"))
}

    return (
        <>
        <div className="card">
        <img src="https://thispersondoesnotexist.com" alt="avatar" />
        <hr />
        <p>{}</p>
        <p>{}</p>
        <p>{}</p>
        <p>{}</p>
        <button onClick ={itemLog}>Log</button>
        </div>
        </>
    )
}

export default DisplayCard