public class Movement {
    
    // Diagonals
    // Checks if the direction is "u"/"up" or "d"/"down" and moves the player diagonally
    public void moveDiagonal(Player p, int amt, String direction){
            if (amt < 0 && (direction.equals("u") || direction.equals("up")) || amt > 0 && (direction.equals("d") || direction.equals("down"))) {
                p.setCurrentPositionX(p.getCurrentPositionX() + amt);
                p.setCurrentPositionY(p.getCurrentPositionY() - amt);
            } else {
                p.setCurrentPositionX(p.getCurrentPositionX() + amt);
                p.setCurrentPositionY(p.getCurrentPositionY() + amt);
            }
    }

    // Across
    // Checks if the direction is "v"/"vertical" or "h"/"horizontal" and moves player up/down or left/right 
    public void moveAcross(Player p, int amt, String direction){
        // Vertical, up or down
        if(direction.equals("v") || direction.equals("vertical")){
            p.setCurrentPositionY(p.getCurrentPositionY() + amt);
        // Horizontal, right or left
        }else if(direction.equals("h") || direction.equals("horizontal")){
            p.setCurrentPositionX(p.getCurrentPositionX() + amt);
        }
    }
}
