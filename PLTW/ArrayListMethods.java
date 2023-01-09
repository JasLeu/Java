package PLTW;

import java.util.*;

public class ArrayListMethods {
    private static ArrayList<String> testList = new ArrayList<String>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");
        String ans = sc.nextLine();
        switch (ans) {
            case "a":
                System.out.println("Animal: ");
                break;
            case "i":
                System.out.println("Animal: ");
                break;
            case "r":
                System.out.println();
                break;
            case "p":
                System.out.println();
                break;
            case "q":
                System.out.println("Final list: " + testList.toString());
                System.exit(0);
        }

    }
}

