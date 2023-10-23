import {input} from "../tool.js"

export class Ihm {
    constructor() {
        this.game =[]; // this area is my virtual Tic TAc Toe 
    }

// create my ihm for my players to play! They shoudl have a panel of choices. There choices should be checked if there are a win or a draw 

    async menu() {          
        let choice = "";  // variable for answer 
        let isOver = false; // variable for checking if the game is over
        let isAwinner = false; // A token of victory

        
        
        while(!isOver) {
            if(turnCounter>=this.game.lenght){  // if my turn counter is over my tic tac toe [number], then none of my players won  
                console.log("It's a DRAW!");
                isOver=true; 
            }else{
                
                console.log("XOXO Let's play Some Tic Tac Toe XOXO\n ");
                console.log("Choose where you'd like to PLAY!");
                
                for (let i = 0 ; i<this.game.length;  i++){    
                    this.game[i] != ""? 
                    console.log(`Till ${i+1}`) 
                    : console.log("( ´･･)ﾉ(._.`)"); // My display rules out the tills already played
                }
                
                choice = await input("Please, make your choice")
                
                if (this.game[choice - 1] === "") {
                    this.game[choice - 1] = isPlayerX ? "X" : "O";
                        
                    // Check for a winning scenario
                    isAwinner = this.checkWinningScenario(
                        isPlayerX ? "X" : "O"
                    );

                    if (isAwinner) {
                        console.log(
                            isPlayerX ? "Player X wins!" : "Player O wins!"
                        );
                        isOver = true;
                    } else {
                        isPlayerX = !isPlayerX; // Toggle player turn
                        turnCounter++;
                    }
                } else {
                    console.log("Invalid choice. Please choose an empty cell.");
                }
        }
    }
}
}