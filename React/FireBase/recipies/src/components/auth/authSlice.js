import {createSlice} from '@reduxjs/toolkit'

const authSlice = createSlice ({
    name: "auth", 
    initialState: {
        user: null, 
        authMode: "Connexion"
    }, 
    reducers: {
        setUser : (state, action) => {
            state.user = action.payload
        },
        removeUser : (state, action)=>{
            state.user = null
            localStorage.removeItem("token")
        }, 
        setAuthMode : (state, action) => {
            state.authMode = action.payload
        }

    }

})

export const { setUser, removeUser, setAuthMode} = authSlice.action
export default authSlice.reducer 
