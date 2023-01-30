package PLTW;



import java.util.*;

public class ArrayListMethods {
    private static ArrayList<String> testList = new ArrayList<String>(Arrays.asList("Dog", "Cat", "Bird"));
    private static Scanner sc = new Scanner(System.in);
    private static String animal;
    private static int position;
    public static void main(String[] args) {
        System.out.println(testList);
        while (true) {
            System.out.println(ask());
        }
        
        
    }

    private static boolean isValid(String input) {
        for (int i=0; i<input.length();i++) {
            if (!Character.isLetter(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String ask() {
        System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");
        String ans = sc.nextLine();
        if (!isValid(ans)) {
            System.out.println("Please enter a valid input.");
            ask();
        }

        switch (ans) {
            case "a":
                System.out.print("Enter a valid animal: ");
                animal = sc.nextLine();
                if (!isValid(animal)) {
                    System.out.println("Please enter a valid input.");
                    ask();
                }
                testList.add(animal);
                break;
            case "i":
                System.out.print("Enter a valid animal: ");
                animal = sc.nextLine();
                if (!isValid(animal)) {
                    System.out.println("Please enter a valid input.");
                    ask();
                }
                System.out.print("Enter a position: ");
                try {
                    position = Integer.parseInt(sc.nextLine());
                    testList.add(position - 1, animal);
                } catch (Exception e) {
                    System.out.println("Bad position!");
                    ask();
                }
                break;
            case "r":
                System.out.print("Enter a position: ");
                try {
                    position = Integer.parseInt(sc.nextLine());
                    testList.remove(position-1);
                } catch (Exception e) {
                    System.out.println("Bad position!");
                    ask();
                }
                break;
            case "p":
                System.out.print("Enter a valid animal: ");
                animal = sc.nextLine();
                if (!isValid(animal)) {
                    System.out.println("Please enter a valid input.");
                    ask();
                }
                System.out.print("Enter a position: ");
                try {
                    position = Integer.parseInt(sc.nextLine());
                    testList.set(position - 1, animal);
                } catch (Exception e) {
                    System.out.println("Bad position!");
                    ask();
                }
                break;
            case "q":
                System.out.println("Final list: " + testList.toString());
                System.exit(0);
                break;
            default:
                ask();

        }
        return testList.toString();
    }
}

