public class Knight extends Player {
    public Knight() {
        super("Knight");
    }

    //moves diagonally depending on the direction and can only move down until it reaches the bottom of the grid
    public void move(int num, String direction){
        int x = super.getCurrentPositionX();
        int y = super.getCurrentPositionY();
        if(direction.equals("R") && x + num < 6 && y + num < 6){
            super.setCurrentPositionX(x++);
            super.setCurrentPositionY(num++);
        }else if(direction.equals("L") && x > 0 && y > 0){
            super.setCurrentPositionX(num--);

        }
    }
}
