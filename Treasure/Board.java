import java.lang.Math;
public class Board {
    //instance variables 
    private int x, y;
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
}
