import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Treasure {
    private int numTreasures = 0;
    private String location;
    private Board b = new Board();

    private ArrayList<String> locations = new ArrayList<String>(Arrays.asList("Lush Woods", "Precious Grove", "Misty Brook Covert","Arborgar Woods", "Parallel Forest"));
    
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
        int locationNum = (int) (Math.random() * locations.size());
        location = locations.get(locationNum);

    }

    public void addTreasure() {
        numTreasures++;
    }
    
    public boolean checkInput() {
        return true;

    }
}
