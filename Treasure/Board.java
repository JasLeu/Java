import java.lang.Math;
import java.lang.Math;
//import java.util.Scanner;
public class Board {

    // Instance variables 
    private int x, y;

    //private Player[][] board = new Player[7][7];
    //private Scanner sc = new Scanner(System.in);

    // Constructors
    public Board () {
        x = (int) (Math.random() * 50);
        y = (int) (Math.random() * 50);
    }
    
    public Board (int x, int y) {
        this.x = x;
        this.y = y;
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
    public void setTreasure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void play() {
        // test
        Player p = new Player();
        p.getCoord();
        Treasure t = new Treasure();
        t.setLocation();
        t.getCoord();
        t.getClue(p.getCurrentPositionX(), p.getCurrentPositionY());

    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }
}
