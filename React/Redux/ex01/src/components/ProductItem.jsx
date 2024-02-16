// import { useDispatch } from "react-redux";
// import {deleteProduct, editProduct} from "./productsSlice"


// const ProductItem =(props)=> {
// const product = props.product; 
// const dispatch = useDispatch()

// return(
//     <>
//     <div className="card">
//         <span>
//             {product.title} - {product.available ? 'Disponible' : 'Victime de son succès'}
//             <hr></hr>
//             {product.description}
//         </span>
//     </div>
//     <button className="btn btn-info m-2" onClick={() => dispatch(editProduct({ id: product.id, title: "New Title", description: "New Description" }))}>Editer</button>


//     <button className="btn btn-danger" onClick={()=>dispatch(deleteProduct(product.id))}>Supprimer</button>

//     </>
// )
// }

// export default ProductItem

import React, { useState } from 'react';
import { useDispatch } from 'react-redux';
import { editProduct, deleteProduct } from './productsSlice';

const ProductItem = (props) => {
  const product = props.product;
  const dispatch = useDispatch();

  // State to control whether the edit form is displayed
  const [isEditing, setIsEditing] = useState(false);

  // State for tracking edited data
  const [editedTitle, setEditedTitle] = useState(product.title);
  const [editedDescription, setEditedDescription] = useState(product.description);

  const handleEdit = () => {
    // Dispatch the editProduct action with edited data
    dispatch(
      editProduct({
        id: product.id,
        title: editedTitle,
        description: editedDescription,
        })
    );

    setIsEditing(false);
    };

    return (
    <>
        <div className="card text-center p-4 m-4 d-flex">
        <span>
            <h5 className='display-6'>{product.title}</h5>
            <p className='text-secondary'>{product.available ? 'Disponible' : 'Victime de son succès'}</p>
            <hr></hr>
            {product.description}
        </span>

    {isEditing ? (
        <div>
        <input
            type="text"
            value={editedTitle}
            onChange={(e) => setEditedTitle(e.target.value)}
            />
        <input
            type="text"
            value={editedDescription}
            onChange={(e) => setEditedDescription(e.target.value)}
            />
        <button onClick={handleEdit}>Save Changes</button>
        </div>
    ) : (
        <button className="d-inline btn btn-info m-2 d-inline" onClick={() => setIsEditing(true)}>
        Editer
        </button>
    )}
    <button className="d-inline btn btn-danger" onClick={() => dispatch(deleteProduct(product.id))}>
        Supprimer
    </button>
    </div>
    </>
    );
};

export default ProductItem;
