import java.time.*;
import java.time.format.*;

public class DateCheck {
    public static void main(String... args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        
        System.out.println(d);
        
        Period p = Period.of(1, 2, 3);
        System.out.println(p);
        
        d = d.minus(p);
        System.out.println(d);
        
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}