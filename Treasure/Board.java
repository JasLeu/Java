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
        x = (int) Math.random() * 50;
        y = (int) Math.random() * 50;
    }
    
    public Board (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getDifX(int x) {
        return x - this.x;
    }

    public int getDifY(int y) {
        return y -  this.y;
    }

    // Setters
    public void setPlayer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void play() {
        Player p = new Player();
    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }
}
