package ATM_Machine;
public class Action {
    public static double deposit(double balance, double amount) {
        balance += amount;
        return balance;
    }

    public static double withdraw(double balance, double amount) {
        balance -= amount;
        return balance;
    }
    
}