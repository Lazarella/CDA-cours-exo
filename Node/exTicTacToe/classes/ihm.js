import {input} from "../tools.js"

export class Ihm {
    constructor() {
        this.game = ["", "", "", "", "", "", "", "", ""]; // this area is my virtual Tic TAc Toe 
        this.turnCounter = 0; // keep count of my turns so I can spot a draw
        this.isPlayerX = true; 
    }

// create my ihm for my players to play! They shoudl have a panel of choices. There choices should be checked if there are a win or a draw 

    async menu() {          
        let choice = "";  // variable for answer 
        let isOver = false; // variable for checking if the game is over
        let isAwinner = false; // A token of victory

        this.Start()
        
        while(!isOver) {
            if(this.turnCounter>=this.game.lenght){  // if my turn counter is over my tic tac toe [number], then none of my players won  
                console.log("It's a DRAW!");
                isOver=true; 
            }else{
                
                // for (let i = 0 ; i<this.game.length;  i++){    
                //     this.game[i] != ""? 
                //     console.log(`Cell ${i+1}`) 
                //     : console.log("( ´･･)ﾉ(._.`)"); // My display rules out the cell(s) already played
                // }
                
                choice = await input("Please, make your choice")
                
                if (this.game[choice - 1] === "") {
                    this.game[choice - 1] = this.isPlayerX ? "X" : "O";
                        
                    // Check for a winning scenario
                    isAwinner = this.checkWinningScenario(
                        this.isPlayerX ? "X" : "O"
                    );

                    if (isAwinner) {
                        console.log(
                            this.isPlayerX ? "Player X wins!" : "Player O wins!"
                        );
                        isOver = true;
                    } else {
                        this.isPlayerX = !this.isPlayerX; // Toggle player turn
                        this.turnCounter++;
                    }
                } else {
                    console.log("Invalid choice. Please choose an empty cell.");
                }
        }
    }


// Implement the checkWinningScenario function
checkWinningScenario(player) {
    // Check rows for a win
    for (let i = 0; i < 3; i++) {
        if (
            this.game[i * 3] === player &&
            this.game[i * 3 + 1] === player &&
            this.game[i * 3 + 2] === player
        ) {
            return true;
        }
    }

    // Check columns for a win
    for (let i = 0; i < 3; i++) {
        if (
            this.game[i] === player &&
            this.game[i + 3] === player &&
            this.game[i + 6] === player
        ) {
            return true;
        }
    }

    // Check diagonals for a win
    if (
        (this.game[0] === player && this.game[4] === player && this.game[8] === player) ||
        (this.game[2] === player && this.game[4] === player && this.game[6] === player)
    ) {
        return true;
    }

    return false;
}

}
Start(){
    console.log("\tXOXO Let's play Some Tic Tac Toe XOXO\n\n ");
    console.log("\tChoose where you'd like to PLAY!\n\n");
    console.log("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n");
}
}