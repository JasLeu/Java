import java.util.Scanner;
public class Player {
    private String name;
    private int currentPositionX;
    private int currentPositionY;
    private int numTreasures = 0;
    private Scanner sc = new Scanner(System.in);

    public Player () {
        System.out.print("Name: ");
        name = sc.nextLine();
        currentPositionX = (int) Math.random() * 50;
        currentPositionY = (int) Math.random() * 50;
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
        currentPositionX = y;
    }

    public int getCurrentPositionX(){
        return currentPositionX;
    }

    public int getCurrentPositionY(){
        return currentPositionY;
    }

    public String getName() {
        return name;
    }
    
}
