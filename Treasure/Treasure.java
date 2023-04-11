import java.lang.Math;

public class Treasure {
    private static int treasureAmountGoal;
    private static Board b = new Board();
    private static int currentPositionX;
    private static int currentPositionY;
    

    public void getClue(int x, int y) {
        int type = (int) (Math.random()+0.5) * 2;
        System.out.println((type < 1 && b.getDifX(x) != 0) ? (b.getDifX(x) < 0) ? "The treasure is more to the right." : "The treasure is more to the left." : (b.getDifY(y) < 0 && b.getDifY(y) != 0) ? "The treasure is higher." : (b.getDifY(y) > 0) ? "The treasure is lower." : null);
    }

    public static String getCoord() {
        return "(" + currentPositionX + ", " + currentPositionY + ")";
    } 

    public void setTreasureAmountGoal(int amt) {
        treasureAmountGoal = amt;
    }

    public void setLocation() {
        currentPositionX = (int) (Math.random() * 50);
        currentPositionY = (int) (Math.random() * 50);
        b.setTreasure(currentPositionX, currentPositionY);
    }

    public int treasureAmountGoal() {
            return treasureAmountGoal;
        } 
    
    public boolean treasureFound(Player p) {
        if (Player.getCoord().equals(getCoord())) {
            return true;
        } else {System.out.println("The treasure's location: (" + currentPositionX + ", " + currentPositionY + ")");return false;}
    }
}
