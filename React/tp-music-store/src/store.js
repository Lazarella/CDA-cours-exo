import { configureStore } from "@reduxjs/toolkit";
import authSlice from "./components/auth/authSlice";
import albumItemsSlice from "./components/album/albumItemsSlice";

export default configureStore({
    reducer: {
        auth : authSlice,
        albumItems : albumItemsSlice, 
    }
})