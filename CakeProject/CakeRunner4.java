package CakeProject;

public class CakeRunner4 {
    public static void main(String[] args)
    {
        double t = 3.0;
        
        System.out.println("In main, before new Cake, actual param t=" + t);
        Cake myCake = new Cake(t);
        Cake mySecondCake = new Cake(2);
        Cake myThirdCake = new Cake();
        System.out.println("In main, after new Cake, actual param t=" + t);
    }
}
