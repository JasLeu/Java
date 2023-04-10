import java.lang.Math;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Treasure {
    private int numTreasures = 0;
    private String location;
    private Board b = new Board();
    private int currentPositionX;
    private int currentPositionY;
    

    public void getClue(int x, int y) {
        int type = (int) (Math.random()+0.5) * 2;
        System.out.println((type < 1) ? (b.getDifX(x) < 0) ? "The treasure is more to the right." : "The treasure is more to the left." : (b.getDifY(y) < 0) ? "The treasure is higher." : "The treasure is lower.");
        /* if (b.getDifX(x) < 0) {
            System.out.println("The treasure is more to the right.");
        } else {
            System.out.println("The treasure is more to the left");
        } */
        
    }

    

    public boolean treasureFound() {
        if ((int) (Math.random() * 100) + 1 > 50) {
            addTreasure();
            return true;
        } else {return false;}
    }

    //
    public void setLocation() {
        currentPositionX = (int) (Math.random() * 50);
        currentPositionY = (int) (Math.random() * 50);
        b.setTreasure(currentPositionX, currentPositionY);
    }

    public void addTreasure() {
        numTreasures++;
    }


    public void getCoord() {
        System.out.println("(" + currentPositionX + ", " + currentPositionY + ")");
    }
}
