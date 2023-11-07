import {createSlice} from '@reduxjs/toolkit';

const authSlice = createSlice({
    name: "auth", 
    initialeState: {
        user: null, 
        authMode: "Sign Up"
    }, 
    reducers: {
        setUser : (state, action) => {
            state.user = action.payload
        }, 
        removeUser : (state, action) => {
            state.user = null
            localStorage.removeItem("token")
        }, 
        setAuthMode : (state, action) => {
            state.authMode = action.payload
        }
    }
})

export const {setUser, removeItem, setAuthMode} = authSlice.actions
export default authSlice.reducer 