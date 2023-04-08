public class Player {
    private String name;
    private int currentPositionX;
    private int currentPositionY;
    private int numTreasures;

    public Player (String n) {
        name = n;
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
