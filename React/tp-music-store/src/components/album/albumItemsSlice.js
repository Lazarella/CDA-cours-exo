import { createSlice, createAsyncThunk } from '@reduxjs/toolkit'
import axios from 'axios'
import { Base_DB_URL } from '../../firebaseConfig'

export const fetcthAlbums = createAsyncThunk(
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
export const createAlbum = createAsyncThunk(
'albums/createAlbums', 
async (newAlbum) => {
    const response = await axios.post(Base_DB_URL+"/albumList.json", newAlbum); 
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
        albumList: [],
    },
    reducers: {},
    extraReducers: (builder) => {
        builder.addCase(fetcthAlbums.fulfilled, (state, action) => {
        state.albumList = action.payload;
        console.table(state.albumList);
        })
        builder.addCase(createAlbum.fulfilled, (state, action) =>{
            state.albumList.push(action.payload)
        })
        builder.addCase(updateAlbum.fulfilled, (state, action) =>{
            state.albumList = action.payload; 
            console.table(state.albumList)
        })
        builder.addCase(deleteAlbum.fulfilled, (state, action) =>{
            state.albumList = state.albumList.filter((album) => album.id !== action.payload);
            console.table(state.albumList);
        })    
    },
});

export default albumItemsSlice.reducer