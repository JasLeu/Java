public class Movement {
    
    // Diagonals
    public static void moveUpRight(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() + amt);
        p.setCurrentPositionY(p.getCurrentPositionY() + amt);
    }

    public static void moveDownRight(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() + amt);
        p.setCurrentPositionY(p.getCurrentPositionY() - amt);
    }

    public static void moveUpLeft(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() - amt);
        p.setCurrentPositionY(p.getCurrentPositionY() + amt);
    }

    public static void moveDownLeft(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() - amt);
        p.setCurrentPositionY(p.getCurrentPositionY() - amt);
    }

    // Across
    public static void moveUp(Player p, int amt) {
        p.setCurrentPositionY(p.getCurrentPositionY() + amt);
    }
    public static void moveDown(Player p, int amt) {
        p.setCurrentPositionY(p.getCurrentPositionY() - amt);
    }
    public static void moveLeft(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() - amt);
    }
    public static void moveRight(Player p, int amt) {
        p.setCurrentPositionX(p.getCurrentPositionX() + amt);
    }
}
