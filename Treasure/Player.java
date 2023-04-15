import java.util.Scanner;

/**
 * Player class, a subclass of the Movement class
 * Sets the player's location and actions
 */
public class Player extends Movement {
    private static int currentPositionX;
    private static int currentPositionY;
    private String name;
    private int numTreasures = 0;
    private Scanner sc = new Scanner(System.in);

    // Gets player name and sets them at a random (x,y) position
    public Player () {
        System.out.print("Name: ");
        name = sc.nextLine();
        currentPositionX = (int) (Math.random() * 50);
        currentPositionY = (int) (Math.random() * 50);
    }

    // Setters
    public void setTreasures(int t) {
        numTreasures = t;
    }

    public void setCurrentPositionX(int x){
        currentPositionX = x;
    }

    public void setCurrentPositionY(int y){
        currentPositionY = y;
    }

    // Getters
    public int getCurrentPositionX(){
        return currentPositionX;
    }

    public int getCurrentPositionY(){
        return currentPositionY;
    }

    public String getName() {
        return name;
    }
    
    public int getTreasureAmount() {
        return numTreasures;
    }

    // Methods
    // Adds to the number of treasures
    public void addTreasure() {
        numTreasures++;
    }

    // Returns the current location of the player
    public static String getCoord() {
        System.out.println("\nYour current location: (" + currentPositionX + ", " + currentPositionY + ")");
        return "(" + currentPositionX + ", " + currentPositionY + ")";
    }

    // Grabs the amount and direction and uses the moveDiagonal method in the Movement class
    public void moveDiagonal(int amt, String direction) {
        super.moveDiagonal(this, amt, direction);
    }

    // Grabs the amount and direction and uses the moveAcross method in the Movement class
    public void moveAcross(int amt, String direction) {
        super.moveAcross(this, amt, direction);
    }
    
}
