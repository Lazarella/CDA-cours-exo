
import { input } from "../tool.js";

export class Ihm {
    constructor() {
        this.game = Array(9).fill(""); // Initialize a 3x3 board
    }

    async menu() {
        let choice = ""; // Variable for answer
        let isOver = false; // Variable for checking if the game is over
        let turnCounter = 0; // Initialize turnCounter
        let isAwinner = false; // A token of victory

        while (!isOver) {
            if (turnCounter >= this.game.length) {
                console.log("It's a DRAW!");
                isOver = true;
            } else {
                console.log("XOXO Let's play Some Tic Tac Toe XOXO\n ");
                console.log("Choose where you'd like to PLAY!");

                for (let i = 0; i < this.game.length; i++) {
                    this.game[i] !== ""
                        ? console.log(`Till ${i + 1}`)
                        : console.log("( ´･･)ﾉ(._.`)");
                }

                choice = await input("Please, make your choice");

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

    // Implement the checkWinningScenario function (as previously shown)
    checkWinningScenario(player) {
        // Check for a winning scenario here
        // ...
    }
}
