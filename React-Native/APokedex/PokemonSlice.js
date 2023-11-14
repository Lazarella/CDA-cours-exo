import {createAsyncThunk, createSlice} from "@reduxjs/toolkit"
import axios from "axios"

const BASE_URL = "https://pokeapi.co/api/v2/pokemon"

export const fetchPokemons = createAsyncThunk(
    'pokemon/fetchPokemons',
    async () => {
        const response = await axios.get(`${BASE_URL}?limit=40`);
        console.log(response.data)
        return response.data.results; 
    }
);


export const fetchPokemon = createAsyncThunk(
    'pokemon/fetchPokemon',
    async (id) => {
        const response = await axios.get(BASE_URL+`/${id}`)
        return response.data
    }
)

const PokemonSlice = createSlice({
    name : "pokemon", 
    initialState: {
        pokemons: [], 
        // pokedex: [], BONUS
        // displayPokemon: false
        selectedPokemon: {},
        loading: false,
        error: null
    }, 
    reducers:{
        // addPokedex : (state, action) => {  BONUS
        //     state.pokedex.push(action.payload)
        // }
    },
    extraReducers: (builder)=>{
        builder
        .addCase(fetchPokemons.pending, (state) => {
            state.loading = true;
        })
        .addCase(fetchPokemons.fulfilled, (state, action) => {
            state.pokemons = action.payload;
            state.loading = false;
        })
        .addCase(fetchPokemons.rejected, (state, action) => {
            state.loading = false;
            state.error = action.error.message;
        })
        .addCase(fetchPokemon.pending, (state) => {
            state.loading = true;
        })
        .addCase(fetchPokemon.fulfilled, (state, action) => {
            state.selectedPokemon = action.payload; 
            state.loading = false;
        })
        .addCase(fetchPokemon.rejected, (state, action) => {
            state.loading = false;
            state.error = action.error.message;
        });
}
})

// export const {}

export default PokemonSlice.reducer