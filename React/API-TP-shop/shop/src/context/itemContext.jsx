import { createContext, useContext } from "react";
import Item from "../modele/item";

export const myShopContext = createContext();

export const useItemContext = () => {
  return useContext(myShopContext);
};

export const ItemProvider = ({ children }) => {
  const itemInstance = new Item();

  return (
    <myShopContext.Provider value={itemInstance}>
      {children}
    </myShopContext.Provider>
  );
};

