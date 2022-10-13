// import java.time.format.DateTimeFormatter;
// import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Test
{

    /*
    * Activity 2.4.3
    */
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    ArrayList<String> vowels = new ArrayList<String>();

    Collections.addAll(vowels, "a", "e", "i", "o", "u");
    System.out.print("String: ");
    String userInput = input.nextLine();

    for (int i = 0; i < userInput.length(); i++) {
        if (vowels.contains(userInput.substring(i, i+1))) {
            int index = userInput.indexOf(userInput.substring(i, i+1));
            userInput = userInput.substring(0, index) + userInput.substring(index+1);
        }
    }
    System.out.print(userInput);
    input.close();
    }
}
