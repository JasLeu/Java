public class Player {
    private String name;
    private int numTreasures;

    public void setName(String n) {
        name = n;
    }

    public void addTreasure() {
        numTreasures++;
    }

    public void setTreasures(int t) {
        numTreasures = t;
    }

    public String getName() {
        return name;
    }
    
}