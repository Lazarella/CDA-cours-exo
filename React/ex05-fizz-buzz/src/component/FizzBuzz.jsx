import { useState } from "react";



const FizzBuzz = ({ maxValue}) =>{


const [userNumber, setUserNumber] = useState(0);

const checkValue = (event) => {
    const inputValue = parseInt(event.target.value, 10);
    if (!isNaN(inputValue)) {
    setUserNumber(Math.min(inputValue, maxValue));
    } else {
      setUserNumber(0); // Set to 0 for invalid input
    }
};

const increment = () => {
    if (userNumber < maxValue) {
        setUserNumber(userNumber + 1);
    } else {
        alert("Vous avez atteint la limite");
    }
};

const decrement = () => {
    if (userNumber > 0) {
        setUserNumber(userNumber - 1);
    } else {
        alert("Restons positif voyons!");
    }
};
let outputText = "";
if (userNumber % 3 === 0) {
    outputText += "Fizz ";
}
if (userNumber % 5 === 0) {
    outputText += "Buzz";
}

    return(
        <>
        <h1>Fizz Buzz</h1>
        <hr />
        <input type="text" onInput={checkValue} value={userNumber === 0 ? "" : userNumber}/>
        <div>
        <h4>{outputText || userNumber}</h4>
        </div>
        <button onClick={decrement}>-</button>
        <button onClick={increment}>+</button>
        </>
    )
}

export default FizzBuzz
