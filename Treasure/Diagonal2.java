import java.time.Year;

public class Diagonal2 {

        private static int newX;
        private static int newY;
    
        //retuns a new x value where the Player should land
        public static int moveX(int x, int spaces, String direction) {
                if(spaces > 0 && direction.equals("u")){
                    newX = x - spaces;
                }else if(spaces <= 0 && direction.equals("u")){
                    newX = x + spaces;
                }else if(spaces > 0 && direction.equals("d")){
                    newX = x + spaces;
                }else if(spaces <= 0 && direction.equals("d")){
                    newX = x + spaces;
                }

                return newX;
        }

        public static int moveY(int y, int spaces, String direction) {
                if(spaces > 0 && direction.equals("u")){
                    newY = y - spaces;
                }else if(spaces <= 0 && direction.equals("u")){
                    newY = y + spaces;
                }else if(spaces > 0 && direction.equals("d")){
                    newY = y + spaces;
                }else if(spaces <= 0 && direction.equals("d")){
                    newX = y - spaces;
                }

                return newY;
        }

    
}
