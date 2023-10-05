// import { useContext } from "react"
// import { cardContext } from "../contexts/cardContext"
import { useEffect } from "react"
import { useState } from "react"

const AddForm = () => {

    // const [value, setValue] = useContext(cardContext)

const [itemName, setItemName] = useState("")
const [itemUse, setItemUse] = useState("")
const [itemExpired, setItemExpired] = useState(new Date())
const [itemPic, setItemPic] = useState("")
const [canSubmit, setcanSubmit] = useState(false)
// const [itemName, setItemName] = useContext(cardContext)
// const [itemUse, setItemUse] = useContext(cardContext)
// const [itemExpired, setItemExpired] = useContext(cardContext)
// const [itemPic, setItemPic] = useContext(cardContext)
// const [canSubmit, setcanSubmit] = useContext(cardContext)


// const addInfo = (itemName, itemUse, itemExpired, itemPic) => {

// }
const addInfo = (e, fieldName) => {
    const value = e.target.value;

    switch (fieldName) {
        case 'itemName':
        setItemName(value);
        break;
        case 'itemUse':
        setItemUse(value);
        break;
        case 'itemExpired':
        setItemExpired(value);
        break;
        case 'itemPicture':
        setItemPic(value);
        break;
        default:
        break;
    }
};


const addItem = () => {
    setItemName("")
    setItemUse("")
    setItemExpired(Date)
    setItemPic("")
}

useEffect(()=> {
    setcanSubmit(!!itemName && !!itemUse && !!itemExpired && !!itemPic)
}, [itemName, itemUse, itemExpired, itemPic])

    return (
        <form action="#" onSubmit={addItem}>
            <div className="form-group">
                <img src={itemPic} alt="an item" />
                <hr />
                <label htmlFor="ItemName">Name</label>
                <input type="text" value={itemName} onChange={(e)=> addInfo(e, 'itemName')}  required className="form-control"/>
            </div>
            <div className="form-group">
                <label htmlFor="Use">Use</label>
                <input type="text" className="form-control" value={itemUse} onChange={(e)=> addInfo(e, 'itemUse')}  required/>
            </div>
            <div className="form-group">
                <label htmlFor="Expired">Expired</label>
                <input type="Date" value={itemExpired} onChange={(e)=> addInfo(e, 'itemExpired')}  required/>
            </div>
            <div className="form-group">
                <label htmlFor="Picture">Picture</label>
                <input type="url" value={itemPic} onChange={(e)=> addInfo(e, 'itemPicture')} required/>
            </div>
            <button disabled={!canSubmit} className="btn btn-succes">Add</button>

        </form>
    )
    
}

export default AddForm;