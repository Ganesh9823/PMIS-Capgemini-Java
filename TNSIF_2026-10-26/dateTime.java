import java.time.LocalDate;
import java.time.Month;
public class dateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Today's date is "+ now);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        
        System.out.println("Date: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        LocalDate customDate = LocalDate.of(year, month, dayOfMonth);//here Month is typecasting automatically to 10
        System.out.println(customDate);
        
        LocalDate yesterday = now.minusDays(1);
        System.out.println(yesterday);
        LocalDate pasDate = now.minusMonths(100);//prints 100 months before today's date
        System.out.println(pasDate);
    }
}
