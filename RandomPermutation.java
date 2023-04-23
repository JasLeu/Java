import java.lang.Math;
import java.util.ArrayList;

public class RandomPermutation {
    public static ArrayList<String> next(ArrayList<String> original) {
        ArrayList<String> o = new ArrayList<String> (original);
        ArrayList<String> r = new ArrayList<String> (o.size());
        for (int i = 0; i < o.size(); i++)
            r.add(" ");
        for (int i = o.size() - 1; i >= 0; i--) {
            int num = (int) (Math.random() * (o.size() ));
            System.out.println(num);
            r.add(i, o.get(num));
            r.remove(i+1);
            o.remove(num);
        }
        return r;
    }
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("red");
        s.add("orange");
        s.add("yellow");
        System.out.println(next(s).toString());
    }
}
