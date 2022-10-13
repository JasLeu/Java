// import java.time.format.DateTimeFormatter;
// import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    ArrayList<String> vowels = new ArrayList<String>();

    Collections.addAll(vowels, "d", "b", "p", "q");
    System.out.print("String: ");
    String stringInput = input.nextLine();
    int i = 0;

    while (i < stringInput.length()-1) {
        int x = stringInput.indexOf(stringInput.substring(i, i+1));
        if (vowels.contains(stringInput.substring(x,x+1))) {
            String newVowel = vowels.get((int)(Math.random()*4));
            System.out.println(newVowel);
            stringInput = stringInput.substring(0, i) + newVowel + stringInput.substring(i+1);
        }
        i++;
    }

    System.out.println(stringInput);
    input.close();
  }
  
}
