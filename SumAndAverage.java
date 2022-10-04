import java.util.Scanner;

public class SumAndAverage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int average = 0;
        int sum = 0;
        int amountOfInputs = 0;

        String input = "";
        while (!input.equals("q")) {
            System.out.print("Enter a number (q to stop): ");
            input = sc.nextLine();
            
            try {
                sum += Integer.parseInt(input);
                amountOfInputs++;
            } catch(Exception e) {
                if (!input.equals("q")) {
                    System.out.println("Must be a valid number!\n");
                }
            } 
            
            
        }

        System.out.println("Sum: " + sum + "\nAverage: " + sum/amountOfInputs);
        sc.close();
    }

}