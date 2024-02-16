import { createSlice } from '@reduxjs/toolkit';
import { v4 as uuidv4 } from 'uuid';

const productSlice = createSlice({
  name: "product",
  initialState: {
    products: [
      { id: 1, title: "Bear spray", description: "Beautiful and handy", available: true },
      { id: 2, title: "Hiking Boots", description: "Durable and comfortable hiking boots for outdoor adventures.", available: true },
      { id: 3, title: "Camping Tent", description: "Spacious and easy-to-setup camping tent for your outdoor trips.", available: false }
    ]
  },
reducers: {
    addProduct: (state, action) => {
        const newProduct = {
        id: uuidv4(),
        title: action.payload.title,
        description: action.payload.description,
        available: true
    }
    state.products.push(newProduct);
    },
    deleteProduct: (state, action) => {
    state.products = state.products.filter(p => p.id !== action.payload);
    }, 
        editProduct: (state, action) => {
            const { id, title, description } = action.payload;
            const productToEdit = state.products.find(p => p.id === id);
            if (productToEdit) {
                productToEdit.title = title;
                productToEdit.description = description;
            }
        }
    }
});

export const { addProduct, deleteProduct, editProduct} = productSlice.actions;
export default productSlice.reducer;
