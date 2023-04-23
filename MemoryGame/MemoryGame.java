import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After watching the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
public class MemoryGame
{
  public static void main(String[] args) {
    ArrayList<String> memoryStrings = new ArrayList<String> (Arrays.asList("r", "o", "y", "g", "b", "i", "v")); // rainbow... haha
    // Create the "memory strings" - an array of single character strings to 
    // show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.
    MemoryGameGUI board = new MemoryGameGUI();
    board.createBoard((int) (Math.random() * 10 + 1), true);
    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.)

    // Play the game until user wants to quit.
    boolean cont = true;
    int rds = 0;
    int score = 0;

    while (cont) {
      String[] randSequence = next(memoryStrings); // randomizes order of the characters
      rds++;
      String pS = board.playSequence(randSequence, .5); // plays the sequence and initializes pS to what the player inputted
      int amt = Integer.parseInt(pS.substring(pS.length() - 1, pS.length())); // the amount of characters the player chose to memorize
      pS = pS.substring(0, pS.length() - 1); // truncates the amt placed at the end of pS
      try {
        if (removePunc(toString(randSequence).substring(0, amt * 2)).equals(removePunc(pS))) { // compares the two strings, if they match returns true, false otherwise
          board.matched();
          score++;
        } else {
          board.tryAgain();
        }
      } catch (NullPointerException e) {/* Do Nothing */ }
      
      if (!board.playAgain())
        break;

      // Create a new array that will contain the randomly ordered memory strings.

      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      // - OR -
      // Overload the next method in RandomPermutation to create a random sequence 
      // of the memory strings, passed as a parameter.

      // Play one sequence, delaying half a second for the strings to show
      // in the buttons. Save the player's guess. 
      // (Later, you can speed up or slow down the game.)

      // Determine if player's guess matches all elements of the random sequence.
      
        // Cleanup the guess - remove commas and spaces. Refer to a new String method 
        // replace to make this easy.
        
        // iterate to determine if guess matches sequence

        // If match, increase score, and signal a match, otherwise, try again.

      // Ask if user wants to play another round of the game 
      // and track the number of games played.
    }
    // When done playing, show score and end the game.
    board.showScore(score, rds);
    board.quit();
  }

  /**
   * The next randomized order of the list given.
   * @param originalArray
   * @returns a random order of the elements in the array
   */
  public static String[] next(ArrayList<String> originalArray) {
    ArrayList<String> o = new ArrayList<String> (originalArray);
    String[] r = new String[o.size()];
    for (int i = o.size() - 1; i >= 0; i--) {
        int num = (int) (Math.random() * (o.size() ));
        r[i] = o.get(num);
        o.remove(num);
    }
    return r;
  }

  /**
   * Converts from an array to a string with each element separated by a space
   * @param s
   * @returns The string of the array.
   */
  public static String toString(String[] s) {
    String re = "";
    for (String str : s) {
      re += str + " ";
    }
    return re.trim();
  }
  
  /**
   * Removes spaces and commas
   * @param s
   * @returns The string without any spaces or commas.
   */
  public static String removePunc(String s) {
    String nP = s.replaceAll(" ", "").replaceAll(",", "");
    return nP;
  }
}