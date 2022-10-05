package PLTW;
public class NumberRiddle {
    public static void main(String[] args) {
        int init = 1;
        int num = init;
        System.out.println("num = " + num);
        num *= 2;
        System.out.println("num = " + num);
        num += 6;
        System.out.println("num = " + num);
        double numb = num;
        numb /= 2;
        System.out.println("num = " + numb);
        numb -= init;
        System.out.println("num = " + numb);

        int total = 25;
        int numScores = 3;
        double ave = total/numScores;
        System.out.println(ave);
    }
}
