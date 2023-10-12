import React from "react";
import { useItemContext } from "../context/itemContext";

function HomePage() {
    const { items, loading } = useItemContext();

        if (loading) {
    return <p>Loading...</p>;
    }

    return (
    <div>
        <h1>Blue Cocoon</h1>
        <section id="showCase">
        {items.map((item) => (
            <div id="singleItem" key={item.id}>
            <h6>{item.name}</h6>
            </div>
        ))}
        </section>
    </div>
    );
}

export default HomePage;
