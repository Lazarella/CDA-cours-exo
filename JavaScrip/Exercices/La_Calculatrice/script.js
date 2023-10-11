let read="",
result=0
;

const READ = document.querySelector("#screen");

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

            document.addEventListener("keydown", function(event) {
                // Check if the pressed key corresponds to one of your calculator buttons
                const key = event.key;
            
                // Define a mapping of keyboard keys to calculator button data-keys
                const keyMappings = {
                    "0": "0",
                    "1": "1",
                    "2": "2",
                    "3": "3",
                    "4": "4",
                    "5": "5",
                    "6": "6",
                    "7": "7",
                    "8": "8",
                    "9": "9",
                    "+": "+",
                    "-": "-",
                    "*": "x", // Use * for multiplication
                    "/": "/",
                    ".": ".",
                    "Enter": "=", // Use Enter key for "="
                    "Escape": "C", // Use Escape key for "C" (clear)
                    "Backspace":"C"
                };
            
                // Check if the pressed key is in the mapping
                if (keyMappings.hasOwnProperty(key)) {
                    // Find the corresponding data-key value
                    const dataKey = keyMappings[key];
            
                    // Create a fake event object with the data-key attribute
                    const fakeEvent = {
                        target: {
                            dataset: {
                                key: dataKey
                            }
                        }
                    };
            
                    // Call the getData function with the fake event
                    getData(fakeEvent);
                }
            });

            // Fun stuff


        //     var canvas = document.body.appendChild( document.createElement( 'canvas' ) ),
        //     context = canvas.getContext( '2d' );
        // context.globalCompositeOperation = 'lighter';
        // canvas.width = 800;
        // canvas.height = 800;
        // draw();
        
        // var textStrip = ['ℳ', '₳', 'f', 'Š', 'ɨ', 'ş', 'ħ', 'å', 'ʁ', 'Ð', '☆', '▷', '◁'];
        
        // var stripCount = 60, stripX = new Array(), stripY = new Array(), dY = new Array(), stripFontSize = new Array();
        
        // for (var i = 0; i < stripCount; i++) {
        //     stripX[i] = Math.floor(Math.random()*1265);
        //     stripY[i] = -100;
        //     dY[i] = Math.floor(Math.random()*7)+3;
        //     stripFontSize[i] = Math.floor(Math.random()*16)+8;
        // }
        
        // var theColors = ['#cefbe4', '#81ec72', '#5cd646', '#54d13c', '#4ccc32', '#43c728'];
        
        // var elem, context, timer;
        
        // function drawStrip(x, y) {
        //     for (var k = 0; k <= 20; k++) {
        //         var randChar = textStrip[Math.floor(Math.random()*textStrip.length)];
        //         if (context.fillText) {
        //             switch (k) {
        //             case 0:
        //                 context.fillStyle = theColors[0]; break;
        //             case 1:
        //                 context.fillStyle = theColors[1]; break;
        //             case 3:
        //                 context.fillStyle = theColors[2]; break;
        //             case 7:
        //                 context.fillStyle = theColors[3]; break;
        //             case 13:
        //                 context.fillStyle = theColors[4]; break;
        //             case 17:
        //                 context.fillStyle = theColors[5]; break;
        //             }
        //             context.fillText(randChar, x, y);
        //         }
        //         y -= stripFontSize[k];
        //     }
        // }
        
        // function draw() {
        //     // clear the canvas and set the properties
        //     context.clearRect(0, 0, canvas.width, canvas.height);
        //     context.shadowOffsetX = context.shadowOffsetY = 0;
        //     context.shadowBlur = 8;
        //     context.shadowColor = '#94f475';
            
        //     for (var j = 0; j < stripCount; j++) {
        //         context.font = stripFontSize[j]+'px MatrixCode';
        //         context.textBaseline = 'top';
        //         context.textAlign = 'center';
                
        //         if (stripY[j] > 1358) {
        //             stripX[j] = Math.floor(Math.random()*canvas.width);
        //             stripY[j] = -100;
        //             dY[j] = Math.floor(Math.random()*7)+3;
        //             stripFontSize[j] = Math.floor(Math.random()*16)+8;
        //             drawStrip(stripX[j], stripY[j]);
        //         } else drawStrip(stripX[j], stripY[j]);
                
        //         stripY[j] += dY[j];
        //     }
        // setTimeout(draw, 70);
        // }
        