import { useRef } from "react";
import { useDispatch } from "react-redux";
import { addProduct } from "./productsSlice";

const AddProduct =() => {
    const titleRef = useRef()
    const descriptionRef= useRef()
    const dispatch = useDispatch()

    const handleOnSubmit=(event)=>{
        event.preventDefault(); 
        const title = titleRef.current.value;
        const description = descriptionRef.current.value;
        if (title && description) {
            dispatch(addProduct({ title, description }));
            
        }
    }

    return(
        <>
        <form action="#" onSubmit={handleOnSubmit} className="card bg-dark p-4 d-flex">
            <input 
            type="text"
            placeholder="Ajouter un article"  
            ref={titleRef}
            className="p-3 m-2"
            />
            <input 
            type="text"
            placeholder="Décrivez l'article en quelques mots"  
            ref={descriptionRef}
            className="p-4 m-2"
            />
            <button type="submit" className="btn btn-success m-4">Ajouter</button>
        </form>
        </>
    )
}

export default AddProduct 