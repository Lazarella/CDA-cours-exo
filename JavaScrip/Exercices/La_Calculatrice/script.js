let read="",
result;

const READ = document.querySelector("#screen");

function getData(event){
        let value = event.target.dataset.key
        console.log(value);
        read += ` ${value} `;
        return value;
    }
    
    function myScreen(value){
        let value;
        if(value ==='='){
            read += `<br> = poney`; 
            read += `<br> = ${result}`; 
            
        }else if(value ==='C')
        {
            read = ""; 
            
        }
    }
    
    // if (value !== '='){
        //     result += value;
        //     if (value === '('){
            //        // result += ; 
            //     }
            // }
            
            READ.innerHTML = read;