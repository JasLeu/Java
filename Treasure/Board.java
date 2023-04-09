import java.lang.Math;
import java.util.Scanner;
public class Board {

    // Instance variables 
    private static int x, y;
    private static int treasureX, treasureY;

    //private Player[][] board = new Player[7][7];
    //private Scanner sc = new Scanner(System.in);

    private static String[][] directionGrid = new String[10][10];
    private static String[][] playGrid = new String[10][10];
    private int randomInt;
    private Diagonal2 d = new Diagonal2();
    public static int spaces;
    public static String direction;

    private static Scanner sc = new Scanner(System.in);


    // Constructors
    public Board() {
        treasureX = (int) (Math.random() * 10);
        treasureY = (int) (Math.random() * 10);

        //System.out.println(treasureX);
        //System.out.println(treasureY);

        for(int r = 0; r < directionGrid.length; r++){
            for(int c = 0; c < directionGrid[0].length; c++){
                randomInt = (int) (Math.random() * 2) + 1;
                if(randomInt == 1){
                    directionGrid[r][c] = "d";
                }else{
                    directionGrid[r][c] = "h";
                }
            }
        }

        directionGrid[treasureX][treasureY] = "t";
    }
    

    public static boolean found(int x, int y){
        if(directionGrid[x][y].equals("t")){
            return true;
        }
        return false;
    }

    public static void updateBoard(int x, int y){
        for(int r = 0; r < playGrid.length; r++){
            for(int c = 0; c < playGrid[0].length; c++){
                if(r == y && c == x){
                    System.out.print(" o");
                }else{
                    System.out.print(" x");
                }
            }
            System.out.println();
        }
    }


    // Getters
    public int getDifX(int x) {
        return x - this.x;
    }

    public int getDifY(int y) {
        return y -  this.y;
    }

    public static String getDirection(int x, int y){
        return directionGrid[x][y];
    }


    // Setters
    /*
    public void setPlayer(int x, int y) {
        this.x = x;
        this.y = y;
    }
    */

    public static void play() {
        Player p = new Player();
        x = p.getCurrentPositionX();
        y = p.getCurrentPositionY();
        

        updateBoard(x, y);

        while(!found(x, y)){

            if(getDirection(x, y).equals("d")){
                System.out.println("You can only move diagonally. Would you like to move diagonally up or down, u for up, d for down");
                direction = sc.nextLine();
                //check input
                System.out.println("How many spaces would you like to move? Negative number for left and positive for right");
                spaces = Integer.parseInt(sc.nextLine());
                //check input
                if(!(Diagonal2.moveX(x, spaces, direction) >= 10 || Diagonal2.moveX(x, spaces, direction) < 0 || Diagonal2.moveY(y, spaces, direction) >= 10 || Diagonal2.moveY(y, spaces, direction) < 0) ){
                    p.setCurrentPositionX(Diagonal2.moveX(x, spaces, direction));;
                    p.setCurrentPositionY(Diagonal2.moveY(y, spaces, direction));;
                }
            }else if(getDirection(x, y).equals("h")){
                System.out.println("You can only move horizontally or vertically. Which direction would you like to move? h for horizontal, v for vertical");
                direction = sc.nextLine();
                //check input
                System.out.println("How many spaces would you like to move? Negative number for left/down and positive for right/up");
                spaces = Integer.parseInt(sc.nextLine());
                //check input
                if(!(Straight.moveX(x, spaces, direction) >= 10 || Straight.moveX(x, spaces, direction) < 0 || Straight.moveY(y, spaces, direction) >= 10 || Straight.moveY(y, spaces, direction) < 0) ){
                    p.setCurrentPositionX(Straight.moveX(x, spaces, direction));;
                    p.setCurrentPositionY(Straight.moveY(y, spaces, direction));;
                }
            }

            x = p.getCurrentPositionX();
            y = p.getCurrentPositionY();

            updateBoard(x, y);

        }

        System.out.println("You have found the treasure!");
    }

    public static int randomNum(int range, int min) {
        return (int) (Math.random() * range) + min;
    }
}
