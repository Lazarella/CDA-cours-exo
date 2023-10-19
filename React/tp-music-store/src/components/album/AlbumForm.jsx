import { useRef } from "react";
import { useDispatch } from "react-redux";
import { createAlbum, setFormMode } from "./albumItemsSlice";
import { Base_DB_URL } from "../../firebaseConfig";
import axios from "axios";

//import classes from "./albumForm.module.css"

const AlbumForm =() =>{

    const dispatch = useDispatch()
    const authToken =  localStorage.getItem("token");
    console.log('authToken:', authToken);

    const titleRef = useRef()
    const dateRef = useRef()
    const artistRef = useRef()
    const scoreRef = useRef()
    const coverRef = useRef() 
    const BASE_DB_URL = 'https://cda-carpier-default-rtdb.europe-west1.firebasedatabase.app';


    const addAlbum = async (event) => {
        event.preventDefault()

        const newAlbum = {
            title : titleRef.current.value,
            releaseDate : dateRef.current.value,
            artist : artistRef.current.value, 
            score : scoreRef.current.value,
            coverURL : coverRef.current.value 
        }
        if (authToken) {
            try{
                const response = await axios.post(`${BASE_DB_URL}/albumList.json?auth=${authToken}`, {
                    headers: {
                        "Content-Type" : "application/json"
                    },
                    body: JSON.stringify(newAlbum)
                })
                if(response.status !== 200) {
                    throw new Error("Something went wrong during the POST album request")
                }
                const data = await response.data
                dispatch(createAlbum({id: data.name, ...newAlbum}))
                dispatch(setFormMode(""))
            }catch (error) {
                console.error(error.message);
            }
        }
    }



    return (
        <>
        <label htmlFor="title">Title</label>
        <input type="text" ref={titleRef} placeholder="Green and Grey, the journey"/>
        <label htmlFor="artist">Artist</label>
        <input type="text" ref={artistRef} placeholder="Zombie Machine XXXI"/>
        <label htmlFor="releaseDate">Release Date</label>
        <input type="date" ref={dateRef} />
        <label htmlFor="cover">Cover</label>
        <input type="url" ref={coverRef} />
        <label htmlFor="score">Rank it!</label>
        <input type="number" max="5" min="1" ref={scoreRef} />
        <button onClick={addAlbum}><span className="text">Blast it</span></button>
        </>
    )
}

export default AlbumForm