import java.lang.Math;
import java.util.Scanner;

public class Board {

    // Instance variables 
    private static int x, y;

    //private Player[][] board = new Player[7][7];
    //private Scanner sc = new Scanner(System.in);

    private static int randDirection;
    private static String direction;
    private static int spaces;
    private static String input;
    private static Scanner sc = new Scanner(System.in);


    // Constructors
    public Board() {
        x = (int) (Math.random() * 50);
        y = (int) (Math.random() * 50);
    }
    


    // Getters
    public int getDifX(int x) {
        System.out.println(x - this.x);
        return x - this.x;
    }

    public int getDifY(int y) {
        return y -  this.y;
    }



    // Setters
    
    public void setPlayer(int x, int y) {

    }
    
    //sets treasure location
    public void setTreasure(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static String askAcross(){
        System.out.println("You can only move across. Would you like to move vertically or horizontally? (v for vertical, h for horizontal)");
        input = sc.nextLine().toLowerCase();
        while(!checkIfString(input) || !(input.equals("v") || input.equals("h"))){
            askAcross();
        }
        return input;
    }

    public static String askDiagonal(){
        System.out.println("You can only move diagonally. Would you like to move diagonally up or down, u for up, d for down");
        input = sc.nextLine().toLowerCase();
        while(!checkIfString(input) || !((input.equals("u")) || input.equals("d"))){
            askDiagonal();
        }
        return input;
    }

    public static int askSpacesToMove(){
        System.out.println("How many spaces would you like to move? negative for left/down, positive for right/up");
        while(!checkIfInt(sc.nextLine())){
            askSpacesToMove();
        }
        return Integer.parseInt(sc.nextLine());
    }

    public static boolean checkIfInt(String input) {
        boolean isInt = true; 
        try {
            int integer = Integer.parseInt(input); 
        } catch (NumberFormatException e) {
            isInt = false; 
        }
        return isInt;
    }

    public static boolean checkIfString(String input) {
        boolean isString = false; 
        try {
            int integer = Integer.parseInt(input); 
        } catch (NumberFormatException e) {
            isString = true; 
        }
        return isString;
    }
    
    
    public static void play() {
        // test
        Player p = new Player();
        Treasure t = new Treasure();
        
        p.getCoord();
        t.setLocation();
        t.getCoord();
        t.getClue(p.getCurrentPositionX(), p.getCurrentPositionY());

        randDirection = (int) (Math.random() *2);

        if(randDirection == 0){
            direction = askDiagonal();
            spaces = askSpacesToMove();
            Movement2.moveDiagonal(p, spaces, direction);
        }else{
            direction = askAcross();
            spaces = askSpacesToMove();
            Movement2.moveAcross(p, spaces, direction);        
        }


    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }
}
