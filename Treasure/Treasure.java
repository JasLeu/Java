import java.lang.Math;

public class Treasure {
    private int numTreasures = 0;
    private String location;
    private Board b = new Board();
    private int currentPositionX;
    private int currentPositionY;

    public void getClue(int x, int y) {
        if (b.getDifX(x) < 0) {
            System.out.println("The treasure is more to the right.");
        } else {
            System.out.println("The treasure is more to the left");
        }
    }

    public boolean treasureFound() {
        if ((int) (Math.random() * 100) + 1 > 50) {
            numTreasures++;
            addTreasure();
            return true;
        } else {return false;}
    }

    public void setLocation() {
        currentPositionX = (int) Math.random() * 50;
        currentPositionY = (int) Math.random() * 50;

    }

    public void addTreasure() {
        numTreasures++;
    }

    public boolean checkInput() {
        return true;

    }
}
