import React, { useState } from "react";
import AddProduct from "./AddProduct";

const AddBtn = () => {
    const [isModalOpen, setIsModalOpen] = useState(false);

    const handleOpenModal = () => {
    setIsModalOpen(true);
    };

    const handleCloseModal = () => {
    setIsModalOpen(false);
    };

    return (
    <div>
        <button onClick={handleOpenModal}>Ajouter un article</button>
        {isModalOpen && (
        <div className="modal-overlay">
            <div className="modal">
            <button className="close-button" onClick={handleCloseModal}>
                X
            </button>
            <AddProduct />
            </div>
        </div>
        )}
    </div>
    );
};

export default AddBtn;
