import React, { createContext, useContext, useEffect, useState } from "react";
import CRUD from "../service/CRUD"; 

export const MyShopContext = createContext();

export const useItemContext = () => {
  return useContext(MyShopContext);
};

export const ItemProvider = ({ children }) => {
  const [items, setItems] = useState([]);
  const itemCRUD = CRUD();

  useEffect(() => {
    
    itemCRUD.getItem()
      .then(response => {
        setItems(response.data);
      })
      .catch(error => {
        console.error("Error loading items: ", error);
      });
  }, []); 

  const loadItems = () => {
    itemCRUD.getItem()
      .then(response => {
        setItems(response.data);
      })
      .catch(error => {
        console.error("Error loading items: ", error);
      });
  };

  

  return (
    <MyShopContext.Provider value={{ items, loadItems}}>
      {children}
    </MyShopContext.Provider>
  );
};
