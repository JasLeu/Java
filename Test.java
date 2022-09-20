import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Test
{

    public double getPresentValue(int pmt, int i, int n)
    {
        double rate = (double)i/100;
        double tmp = Math.pow((1+rate),-n);
        double value = pmt*(1/tmp)/rate;
        return value;
    }
    
    public static void main(String[] args)
    {
        String greeting = "Welcome";
        System.out.print(greeting);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("MM/dd/yyyy HH:mm"));
        LocalDateTime now = LocalDateTime.now();
        //System.out.print(", today's date is " + dtf.format(now));

        

    }
}
