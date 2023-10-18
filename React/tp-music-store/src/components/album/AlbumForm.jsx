import { useRef } from "react";
import { useDispatch } from "react-redux";
import { createAlbum } from "./albumItemsSlice";

const AlbumForm =() =>{

    const dispatch = (useDispatch)
    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    const scoreRef = useRef()
    const coverRef = useRef() 

    const addAlbum = (event) => {
        event.preventDefault()

        const newAlbum = {
            title : titleRef.current.value,
            releaseDate : dateRef.current.value,
            artist : artistRef.current.value, 
            score : scoreRef.current.value,
            coverURL : coverRef.current.value 
        }
        dispatch(createAlbum(newAlbum))
    }


    return (
        <>
        <input type="text" ref={titleRef} />
        <input type="text" ref={dateRef} />
        <input type="text" ref={artistRef} />
        <input type="text" ref={scoreRef} />
        <input type="text" ref={coverRef} />
        <button onClick={addAlbum}></button>
        </>
    )
}

export default AlbumForm