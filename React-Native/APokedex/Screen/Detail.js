import { useEffect, useState } from "react";
import {useDispatch} from "react-redux"
import { fetchPokemon } from "../PokemonSlice";
import DetailPokemon from "../component/DetailPokemon";

export default function Detail({id}){


    const dispatch= useDispatch(); 
    const [selectedPokemon, setSelectedPokemon] = useState({})

    useEffect((id)=>{
        const fetchData = async () => {
            try{
                const response = await(fetchPokemon())
                setSelectedPokemon(response.payload)
            }catch(error){
                console.error("Ouch! ce pokémon semble valoriser son intimité : ",error)
            }
        }
        fetchData()
    })

return(
<DetailPokemon></DetailPokemon>
)

}