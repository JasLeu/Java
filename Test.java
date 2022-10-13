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
    System.out.print("String: ");
    String stringInput = input.nextLine();
    int i = 0;

    while (i < stringInput.length()-1) {
        String doubleSpace = stringInput.substring(i, i+2);
        if (doubleSpace.equals("  ")) {
            stringInput = stringInput.substring(0, i) + stringInput.substring(i+1);
        }
        i++;
    }

    System.out.println(stringInput);
  }
  
}
