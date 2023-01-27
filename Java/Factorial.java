package Java;

import java.util.*;

public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static int factorial(int n) {
        if (n >= 0 && n <= 31) {
            return realFactorial(n);
        }
        else {
            throw new IllegalArgumentException("Invalid Input");
        }
    }
    
    private static int realFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * realFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("Factorial number (0-31, -1 to exit): ");
            int num = Integer.parseInt(sc.nextLine());
            if (num == -1) {
                return;
            } else {
                System.out.println(factorial(num) + "\n");
            }
        }
    }
}
