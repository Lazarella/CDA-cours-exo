//Regardless for the merch or brand, user should be able to add or remove items from her/his cart. The shopping list should be storage in local storage.

const myItems = {
    name : "Jean-Christian Ranu", 
    Available : true 
}

const USER_ITEM = document.querySelector('#userItem');
//USER_ITEM.textContent = text; 
const ADD_BTN= document.querySelector('#addBtn');
const MY_LIST = document.querySelector('#myList');



ADD_BTN.onclick = () => {
    console.log("button add clicked")
    const READLIST = document.createElement('li');
    READLIST.className =  'list-group-item d-flex justify-content-between align-items-center';
    READLIST.textContent = myItems.name ;
    console.log(READLIST); 
//MY_LIST.innerHTML= `<li>${myItems.name}</li>`;
localStorage.setItem("product", JSON.stringify(myItems));
}

