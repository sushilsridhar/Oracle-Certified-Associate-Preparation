import java.time.*;


public class DateTest {
    public static void main(String... args) {
            int count = 0;
            LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);
            while (date.getMonth() != Month.APRIL) {
                date = date.minusMonths(1);
                count++;
            }
                
                System.out.println(count);
    }
}