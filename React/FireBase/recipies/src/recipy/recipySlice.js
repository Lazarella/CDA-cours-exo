import {createSlice} from '@reduxjs/toolkit'

const recipySlice = createSlice({
    name:'recipy',
    initialState: {
        recipies: [] 
    }, 
    reducers: {
        addRecipy: (state, action) => {
            state.task.push(action.payload)
        }
    }
})

export const {addRecipy} = recipySlice.actions
export default recipySlice.reducer