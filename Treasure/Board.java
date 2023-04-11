import java.lang.Math;
import java.util.Scanner;

public class Board {

    // Instance variables 
    private int x, y;
    private static int randDirection;
    private static String direction;
    private static int spaces;
    private static String input;
    private static Scanner sc = new Scanner(System.in);
    private static Player p;
    private static Treasure t;


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
        String ans = sc.nextLine();
        while(!checkIfInt(ans)){
            ans = sc.nextLine();
            askSpacesToMove();
        }
        return Integer.parseInt(ans);
    }

    public static boolean checkIfInt(String input) {
        boolean isInt = true; 
        try {
            Integer.parseInt(input); 
            return true;
        } catch (NumberFormatException e) {
            //System.out.println(false);
            isInt = false; 
        }
        return isInt;
    }

    public static boolean checkIfString(String input) {
        boolean isString = false; 

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i+1).equals(" ")) {
                input = input.substring(0, i) + input.substring(i+1);
                i--;
            }
        }

        try {
            Integer.parseInt(input); 
        } catch (NumberFormatException e) {
            isString = true; 
        }
        return isString;
    }
    
    
    public static void play() {
        // test
        p = new Player();
        t = new Treasure();
        
        //p.getCoord();
        t.setLocation();
        //t.getCoord();
        //t.getClue(p.getCurrentPositionX(), p.getCurrentPositionY());
        System.out.println("How many pieces of treasure do you want to find?\n");
        try {
            Treasure.setTreasureAmountGoal(Integer.parseInt(sc.nextLine()));
        } catch (Exception e) {
            Treasure.setTreasureAmountGoal(5);
        }
        ask();


    }

    public static void ask() {
        randDirection = (int) (Math.random() *2);
        System.out.println();

        if(randDirection == 0){
            direction = askDiagonal();
            //System.out.println("1");
            spaces = askSpacesToMove();
            //System.out.println("2");
            Movement.moveDiagonal(p, spaces, direction);
        } else {
            direction = askAcross();
            spaces = askSpacesToMove();
            Movement.moveAcross(p, spaces, direction);        
        }

        
        if (!t.treasureFound(p)) {
            t.getClue(p.getCurrentPositionX(), p.getCurrentPositionY());
            ask();
        } else if (t.treasureFound(p) && p.treasureAmount() < t.treasureAmountGoal()) {
            System.out.println("You found treasure at " + Treasure.getCoord());
        }

        

        System.out.println("Nice! " + p.getName() + " found " + p.treasureAmount() + " pieces of treasure! Play again?\n");
        String ans = sc.nextLine();
        if (ans.equals("y") || ans.equals("yes")) {
            t.setLocation();

            boolean inComplete = true;
            while (inComplete) {
                System.out.println("How many treasures this time?\n"); 
                try {
                    Treasure.setTreasureAmountGoal(p.treasureAmount() + Integer.parseInt(sc.nextLine()));
                    inComplete = false;
                } catch (Exception e) {}
                
            }
            

        } else {System.exit(0);}
        
    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }
}
