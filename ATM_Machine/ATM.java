package ATM_Machine;
import java.util.Scanner;

public class ATM {
    static Scanner action = new Scanner(System.in);
    static String process = "start";
    static double amount;
    static double balance = 500;

    public static void main(String[] args) {
        while (!process.equals("end")) {
            System.out.print("Deposit, withdraw, or check balance? (\"end\" to quit)\n");
            process = action.nextLine().toLowerCase();

            if (process.equals("deposit")) {
                System.out.print("Amount to deposit: ");
                amount = Double.parseDouble(action.nextLine());
                balance = Action.deposit(balance, amount);
            } else if (process.equals("withdraw")) {
                System.out.print("Amount to withdraw: ");
                amount = Double.parseDouble(action.nextLine());
                balance = Action.withdraw(balance, amount);
            } else if (process.equals("check balance")) {
                System.out.printf("You have $%.2f", balance);
                System.out.println(".");
            } 
            System.out.println("");
        }
        
        System.out.println("Thanks for coming!");
    }

}
