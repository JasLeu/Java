public class Movement {
    
    // Diagonals
    public static void moveDiagonal(Player p, int amt, String direction){
            if (amt < 0 && direction.equals("u") || amt > 0 && direction.equals("d")) {
                p.setCurrentPositionX(p.getCurrentPositionX() + amt);
                p.setCurrentPositionY(p.getCurrentPositionY() - amt);
            } else {
                p.setCurrentPositionX(p.getCurrentPositionX() + amt);
                p.setCurrentPositionY(p.getCurrentPositionY() + amt);
            }
    }

    // Across
    public static void moveAcross(Player p, int amt, String direction){
        //vertical, up or down
        if(direction.equals("v")){
            p.setCurrentPositionY(p.getCurrentPositionY() + amt);
        //horizontal, right or left
        }else if(direction.equals("h")){
            p.setCurrentPositionX(p.getCurrentPositionX() + amt);
        }
    }
}
