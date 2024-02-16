import { createSlice, createAsyncThunk } from "@reduxjs/toolkit"
import axios from "axios"
import { Base_DB_URL } from "../../firebaseConfig"

export const fetchAlbums = createAsyncThunk(
'albums/fetchAlbums', 
async () => {
    const response = await axios.get(Base_DB_URL+"/albumList.json"); 
    const data = await response.data; 
    const albumList = []
    for (const key in data){
        albumList.push({id: key, ...data[key]})
    }
    return albumList
}
) 
export const getByIdAlbums = createAsyncThunk(
'albums/getByIdAlbums', 
async (id) => {
    const response = await axios.get(Base_DB_URL+`/albumList.json/${id}`); 
    const data = await response.data; 
    
    return {
        id: data.name,
    } 
}
) 
export const createAlbum = createAsyncThunk(
'albums/createAlbums', 
async (newAlbum, authToken) => {
    const response = await axios.post(Base_DB_URL+`/albumList.json?auth=${authToken}`, newAlbum); 
    const data = await response.data
    return {
        id: data.name,
        ...newAlbum
    }   
}
) 

export const updateAlbum = createAsyncThunk(
'albums/updateAlbums', 
async (id, updatedAlbum) => {
    const response = await axios.get(Base_DB_URL+"/albumList.json/"); 
    const data = await response.data; 

        if (data[id]) {

        data[id] = {...data[id], ...updatedAlbum} 

        await axios.put(Base_DB_URL+`/albumList.json/${id}`, data[id])
        
        return{
            id, ...data[id]
        }
        } else{
        throw new Error ('Album not found')
    }
}) 

export const deleteAlbum = createAsyncThunk(
'albums/deleteAlbums', 
async (id) => {
    const response = await axios.get(Base_DB_URL+"/albumList.json"); 
    const data = await response.data; 
    
    if (data[id]){

        await axios.delete(Base_DB_URL+`/albumList.json/${id}`, data[id])

        console.log("supressed with success! Make a song about it!")
        return id;

    } else{
        throw new Error ('Album not found bro')
    }
}
) 

    

const albumItemsSlice = createSlice({
    name: "albumItems",
    initialState: {
        formMode: "",
        albumList: [],
        selectedAlbum: null, 
    },
    reducers: {
        setFormMode:(state, action) => {
            state.formMode = action.payload
        },
        setSelectedAlbum: (state, action) => {
            state.selectedRecipe = action.payload
        }
    },
    extraReducers: (builder) => {
        builder.addCase(fetchAlbums.fulfilled, (state, action) => {
        state.albumList = action.payload;
        console.table(state.albumList);
        })
        builder.addCase(getByIdAlbums.fulfilled, (state, action) => {
            state.albumList = action.payload;
            })
        builder.addCase(createAlbum.fulfilled, (state, action) =>{
            state.albumList.push(action.payload)
        })
        builder.addCase(updateAlbum.fulfilled, (state, action) => {
            state.albumList = state.albumList.map(album => {
            if (album.id === action.payload.id) {
                return action.payload;
            }
            return album;
            });
            console.table(state.albumList);
        });
        
        builder.addCase(deleteAlbum.fulfilled, (state, action) =>{
            state.albumList = state.albumList.filter((album) => album.id !== action.payload);
            console.table(state.albumList);
        })    
    },
});

export const {setFormMode, setSelectedAlbum} = albumItemsSlice.actions
export default albumItemsSlice.reducer