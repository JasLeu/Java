package Java;
import java.util.Scanner;

public class RemoveAllVowels {
  // main
  public static void main(String[] args)
	{
    // gather variables
    System.out.print("String: ");
    Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		System.out.println("\nThe following shows the letter frequencies:");
    phrase = phrase.toUpperCase();
    String numberOfTimes = "";

    // actual code
    for (int i = 0; i < letters.length(); i++) {
      int counter = 0;
      String curChar = letters.substring(i);
      try {
        curChar = letters.substring(i, i+1);
      for (int x = 0; x < phrase.length(); x++) {
        try{
        if (phrase.substring(x, x+1).equals(curChar)) {
          counter++;
        }
        } catch (Exception e) {}
      }
      } catch (Exception e) {}
      if (!(counter == 0)) {
        numberOfTimes += curChar + ": " + counter + "\n";
      }
    }
    System.out.println("\n" + numberOfTimes);
    sc.close();
  }
}
