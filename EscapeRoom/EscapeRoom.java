/*
* Problem 1: Escape Room
* 
* V1.0
* 10/10/2019
* Copyright(c) 2019 PLTW to present. All rights reserved
*/
import java.util.Scanner;

/**
 * Create an escape room game where the player must navigate
 * to the other side of the screen in the fewest steps, while
 * avoiding obstacles and collecting prizes.
 */
public class EscapeRoom
{

      // describe the game with brief welcome message
      // determine the size (length and width) a player must move to stay within the grid markings
      // Allow game commands:
      //    right, left, up, down: if you try to go off grid or bump into wall, score decreases
      //    jump over 1 space: you cannot jump over walls
      //    if you land on a trap, spring a trap to increase score: you must first check if there is a trap, if none exists, penalty
      //    pick up prize: score increases, if there is no prize, penalty
      //    help: display all possible commands
      //    end: reach the far right wall, score increase, game ends, if game ended without reaching far right wall, penalty
      //    replay: shows number of player steps and resets the board, you or another player can play the same board
      // Note that you must adjust the score with any method that returns a score
      // Optional: create a custom image for your player use the file player.png on disk
    
      /**** provided code:
      // set up the game
      boolean play = true;
      while (play)
      {
        // get user input and call game methods to play 
        play = false;
      }
      */

  public static void main(String[] args) 
  {      
    // welcome message
    System.out.println("Welcome to EscapeRoom!");
    System.out.println("Get to the other side of the room, avoiding walls and invisible traps,");
    System.out.println("pick up all the prizes.\n");
    
    GameGUI game = new GameGUI();
    game.createBoard();
    game.setPrizes(10);
    game.setTraps(5);

    // size of move
    int m = 60; 
    
    // total score in the escape room
    int score = 0;
    
    // to get input
    Scanner in = new Scanner(System.in);
    String[] validCommands = { "right", "left", "up", "down", "r", "l", "u", "d",
    "jumpright", "jr", "jumpleft", "jl", "jumpup", "ju", "jumpdown", "jd",
    "pickup", "p", "quit", "q", "replay", "help", "?"};
  
    // set up game
    boolean play = true;

    
    while (play)
    {
      /* TODO: get all the commands working */
	  /* Your code here */
      String cmd = UserInput.getValidInput(validCommands);
      /*
       * Lines 77 - 92:
       * modifies the player's position based on the direction input given in the console
       */
      if (cmd.equals("right") || cmd.equals("r")) {
        score += game.movePlayer(m, 0);
      } else if (cmd.equals("left") || cmd.equals("l")) {
        score += game.movePlayer(-m, 0);
      } else if (cmd.equals("up") || cmd.equals("u")) {
        score += game.movePlayer(0, -m);
      } else if (cmd.equals("down") || cmd.equals("d")) {
        score += game.movePlayer(0, m);
      } else if (cmd.equals("jr") || cmd.equals("jumpright")) {
        score += game.movePlayer(2 * m, 0);
      } else if (cmd.equals("jl")  || cmd.equals("jumpleft")) {
        score += game.movePlayer(-2 * m, 0);
      } else if (cmd.equals("ju") || cmd.equals("jumpup")) {
        score += game.movePlayer(0, -2 * m);
      } else if (cmd.equals("jd") || cmd.equals("jumpdown")) {
        score += game.movePlayer(0, 2 * m);
      } else if (cmd.equals("pickup") || cmd.equals("p")) {
        score += game.pickupPrize(); // tries to pick up the price if it exists in the current tile
      } else if (cmd.equals("quit") || cmd.equals("q")) {
        System.out.println("Replay? ");
        String ans = in.nextLine(); // gets user input
        if (ans.equals("y") || ans.equals("yes")) { // sees if the player wants to play the game again
          System.out.println(game.replay()); // if "y" or "yes" was inputted, restarts the game
        } else {
          play = false; // ends the game otherwise
        }
      } else if (cmd.equals("?") || cmd.equals("help")) {
        System.out.println("Valid commands: " + validCommands.toString()); // shows a list of valid commands to use
      } 
      if (game.isTrap(0, 0)) {
        score += game.springTrap(0, 0); // springs the trap if the tile the player landed on is a trap
      }
    }
    in.close(); // closes the Scanner
    score += game.endGame(); // "ends" the game while returning a number to add onto the score 

    System.out.println("score=" + score); // shows the score
    System.out.println("steps=" + game.getSteps()); // shows the amount of steps taken
    
  }
}

        