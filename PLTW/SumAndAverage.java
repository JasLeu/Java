package PLTW;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int amountOfInputs = 0;
        String input = "";
        int numPlaces = 2;
        double avg;
        
        while (!input.equals("q")) {
            System.out.print("Enter a number (q to stop): ");
            input = sc.nextLine();
            try {
                sum += Double.parseDouble(input);
                amountOfInputs++;
            } catch(Exception e) {
                if (!input.equals("q")) {
                    System.out.println("Must be a valid number!\n");
                }
            } 
        }

        avg = Math.floor(sum/amountOfInputs*Math.pow(10,numPlaces)+0.5)/Math.pow(10,numPlaces);
        System.out.print("\nSum: " + sum + "\nAverage:" + avg);
        sc.close();
    }
}
