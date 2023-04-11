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
        //System.out.println("x:" + (x - this.x));
        return x - this.x;
    }

    public int getDifY(int y) {
        //System.out.println("y:" + (y - this.y));
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
        System.out.println("You can only move diagonally. Would you like to move diagonally up or down? (u for up, d for down)");
        input = sc.nextLine().toLowerCase();
        while(!checkIfString(input) || !((input.equals("u")) || input.equals("d"))){
            askDiagonal();
        }
        return input;
    }

    public static int askSpacesToMove(){
        System.out.println("How many spaces would you like to move? (negative # for left/down, positive # for right/up)");
        String ans = sc.nextLine();
        while(!checkIfInt(ans)){
            System.out.println("How many spaces would you like to move? (negative # for left/down, positive # for right/up)");
            ans = sc.nextLine();
        }
        return Integer.parseInt(ans);
    }

    public static boolean checkIfInt(String input) {
        try {
            Integer.parseInt(input);
            return true; 
        } catch (NumberFormatException e) {
            return false; 
        }
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

        p = new Player();
        t = new Treasure();
        
        t.setLocation();
        
        System.out.println("How many pieces of treasure do you want to find?\n");
        String input = sc.nextLine();
        if(Integer.parseInt(input) != 0){
            try {
                t.setTreasureAmountGoal(Integer.parseInt(input));
            } catch (Exception e) {
                t.setTreasureAmountGoal(5);
            }
            Player.getCoord();
            ask();
        }else{
            System.out.println("\n Play again next time!");
            System.exit(0);
        }
        


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
        } else if (p.treasureAmount() < t.treasureAmountGoal()) {
            p.addTreasure();
            Board.clearScreen();
            System.out.println("You found treasure at " + Treasure.getCoord() + ".");
            t.setLocation();
            System.out.println("You have " + p.treasureAmount() + " piece(s) of treasure. " + (t.treasureAmountGoal() - p.treasureAmount()) + " piece(s) left.");
            if (p.treasureAmount() != t.treasureAmountGoal())
                ask();
        } 

        
        System.out.println("\nNice! In total, " + p.getName() + " found " + p.treasureAmount() + " piece(s) of treasure! Play again? (y for yes, n for no)\n");
        String ans = sc.nextLine().toLowerCase();
        if (ans.equals("y") || ans.equals("yes")) {
            t.setLocation();

            boolean inComplete = true;
            while (inComplete) {
                System.out.println("How many treasures this time?\n"); 
                String input = sc.nextLine();
                    try {
                        t.setTreasureAmountGoal(p.treasureAmount() + Integer.parseInt(input));
                        System.out.println("Treasure goal: " + t.treasureAmountGoal());
                        inComplete = false;
                    } catch (Exception e) {}
             }
            ask();
            

        } else {clearScreen();System.out.println("See you next time...");System.exit(0);}
        
    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
