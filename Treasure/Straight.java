public class Straight {
    
        private static int newX;
        private static int newY;
    
        //retuns a new x value where the Player should land
        public static int moveX(int x, int spaces, String direction) {
                if(spaces > 0 && direction.equals("h")){
                    newX = x + spaces;
                }else if(spaces <= 0 && direction.equals("h")){
                    newX = x + spaces;
                }else if(direction.equals("v")){
                    newX = x;
                }
            
                return newX;
                
        }

        public static int moveY(int y, int spaces, String direction) {
                if(direction.equals("h")){
                    newY = y;
                }else if(spaces > 0 && direction.equals("v")){
                    newY = y - spaces;
                }else if(spaces <= 0 && direction.equals("v")){
                    newY = y + spaces;
                }
                
                
                return newY;
        }
}
