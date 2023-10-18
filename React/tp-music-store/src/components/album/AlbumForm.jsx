import { useRef } from "react";
import { useDispatch } from "react-redux";
import { createAlbum, updateAlbum } from "./albumItemsSlice";

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
    }
}