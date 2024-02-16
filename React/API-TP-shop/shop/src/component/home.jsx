import React, { useEffect } from "react";
import { useItemContext } from "../context/itemContext";

function HomePage() {
    const { items, loadItems } = useItemContext(); // Use the items and loadItems properties

    // Load items when the component mounts
    useEffect(() => {
        loadItems();
    }, []);

    return (
        <div>
            <h1>Blue Cocoon</h1>
            <section id="showCase">
                {items.map((item) => ( // Use items.map to iterate over the items
                    <div id="singleItem" key={item.id}>
                        <h6>{item.title}</h6> {/* Use item.title instead of item.name */}
                    </div>
                ))}
            </section>
        </div>
    );
}

export default HomePage;
