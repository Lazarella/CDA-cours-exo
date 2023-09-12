let read="",
result=0,
delay = 333;

const READ = document.querySelector("#screen");
//const CHEERIOS = document.querySelector("#cheerios");

function getData(event){
        let value = event.target.dataset.key
        console.log(value);
        if (value === "=") {
            // Calculate the result
            try {
                result = eval(read);
            } catch (error) {
                result = "Error";
            }
            read += `<br> = ${result}`;
        } else if (value === "C") {
            // Clear the screen
            read = "";
            result = 0; // Reset the result
        } else {
            read += value;
        }
        READ.innerHTML = read;
    }
    const cheers=()=>{
        let read = "◁◁ ℳ₳fŠ ɨş ħåʁÐ ▷<br>☆*: .｡. o(≧▽≦)o .｡.:*☆" ;
        READ.classList.add("cheer");
        READ.innerHTML = read;
            }
