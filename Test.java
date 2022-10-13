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
        System.out.print("First Input: ");
        String firstInput = input.nextLine().toLowerCase();
        System.out.print("Second input: ");
        String secondInput = input.nextLine().toLowerCase();
        int i = 0;
        String output = "";
        firstInput = firstInput.replaceAll(" ", "");
        secondInput = secondInput.replaceAll(" ", "");

        if (firstInput.length() == secondInput.length()) {
            for (i = 0; i < firstInput.length();i++) {
                if (secondInput.contains(firstInput.substring(i, i+1))) {
                    int x = secondInput.indexOf(firstInput.substring(i, i+1));
                    secondInput = secondInput.substring(0, x) + secondInput.substring(x + 1);
                }
            }
            if (secondInput.length() == 0) {
                System.out.println("They are anagrams.");
            } else {
                System.out.println("They are not anagrams.");
            }
        } else {
            System.out.println("They are not anagrams.");
        }
        System.out.println(output);
        input.close();
    }
  
}
