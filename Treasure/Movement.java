public class Movement {
    
    // Diagonals
    //combined all the diagonal methods
    public static void moveDiagonal(Player p, int amt, String direction){
        //right, up
        
            p.setCurrentPositionX(p.getCurrentPositionX() + amt);
            p.setCurrentPositionY(p.getCurrentPositionY() + amt);
    }

    /* 
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
    */


    // Across

    //combined all the across methods
    public static void moveAcross(Player p, int amt, String direction){
        //up
        if(amt > 0 && direction.equals("v")){
            p.setCurrentPositionY(p.getCurrentPositionY() + amt);
        //down
        }else if(amt <= 0 && direction.equals("v")){
            p.setCurrentPositionY(p.getCurrentPositionY() + amt);
        //right
        }else if(amt > 0 && direction.equals("h")){
            p.setCurrentPositionX(p.getCurrentPositionX() + amt);   
        //left         
        }else if(amt <= 0 && direction.equals("h")){
            p.setCurrentPositionX(p.getCurrentPositionX() + amt);
        }
    }

    /*
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
    */
}
