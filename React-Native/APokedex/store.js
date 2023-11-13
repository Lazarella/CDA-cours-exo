import {configureStore} from "@reduxjs/toolkit"
import pokemonReducer from "./PokemonSlice.js"

export default configureStore({
    reducer:{
        pokemons: pokemonReducer
    }
})