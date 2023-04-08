import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    //instance variables 
    private int x, y;
    //Pirate, Captain, Knight, Octopus
    //private ArrayList<Player> players = new ArrayList<Player>(Arrays.asList("P", "C", "K", "O"));
    private Player[][] board = new Player[7][7];



    //ArrayList<ArrayList> board;
    
    public Board () {
        x = (int) Math.random() * 50;
        y = (int) Math.random() * 50;
    }
    
    public Board (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDifX(int x) {
        return x - this.x;
    }

    public int getDifY(int y) {
        return y -  this.y;
    }

    public void setPlayer() {
        board[0][0] = new Rook();
        board[0][2] = new Bishop();
    }

    public  void play() {
        Player p = new Player(null);
    }
}
