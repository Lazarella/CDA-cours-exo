import {configureStore} from '@reduxjs/toolkit'
import authSlice from './components/auth/authSlice'
import recipySlice from './components/recipy/recipySlice'

export default configureStore ({
    reducer: {
    auth : authSlice,
    recipy : recipySlice
    }
})