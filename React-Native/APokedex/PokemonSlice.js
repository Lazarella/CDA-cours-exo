import {createSlice} from "@reduxjs/toolkit"
import axios from "axios"

const BASE_URL = "https://pokeapi.co/api/v2/pokemon"

export const fetchPokemons = async () => {
    const data = await axios.get(BASE_URL+'?limit=300')
    return data 
    }
    // .catch(function(error)){ Faire ine gestion d'erreur (comme une page d'erreur par ex)
    //     return (<Text>Oups {error})
    // } 

export const fetchPokemon = async () => {
    const data = await axios.get(BASE_URL+`/${id}`)
    return data
}

const PokemonSlice = createSlice({
    name : "pokemon", 
    initialState: {
        pokemons: [], 
        // pokedex: [], BONUS
        displayPokemon: false
    }, 
    reducers:{
        // addPokedex : (state, action) => {  BONUS
        //     state.pokedex.push(action.payload)
        // }
    },
    extraReducers: (builder)=>{
        (fetchPokemons.fulfilled, (state, action)=> {
        state.pokemons = action.payload
    })
}
})

// export const {}

export default PokemonSlice.reducer