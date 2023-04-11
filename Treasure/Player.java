import java.util.Scanner;

public class Player extends Movement {
    private String name;
    private static int currentPositionX;
    private static int currentPositionY;
    private int numTreasures = 0;
    private Scanner sc = new Scanner(System.in);

    public Player () {
        System.out.print("Name: ");
        name = sc.nextLine();
        currentPositionX = (int) (Math.random() * 50);
        currentPositionY = (int) (Math.random() * 50);
    }

    public void addTreasure() {
        numTreasures++;
    }

    public void setTreasures(int t) {
        numTreasures = t;
    }

    public void setCurrentPositionX(int x){
        currentPositionX = x;
    }

    public void setCurrentPositionY(int y){
        currentPositionY = y;
    }

    public int getCurrentPositionX(){
        return currentPositionX;
    }

    public int getCurrentPositionY(){
        return currentPositionY;
    }

    public int treasureAmount() {
        return numTreasures;
    }

    public static String getCoord() {
        System.out.println("(" + currentPositionX + ", " + currentPositionY + ")");
        return "(" + currentPositionX + ", " + currentPositionY + ")";
    }

    public String getName() {
        return name;
    }
    
}
