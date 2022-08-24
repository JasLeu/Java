import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Test
{
    public static void main(String[] args)
    {
        String greeting = "Welcome";
        System.out.print(greeting);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("MM/dd/yyyy HH:mm"));
        LocalDateTime now = LocalDateTime.now();
        System.out.print(", today's date is " + dtf.format(now));
    }
}
