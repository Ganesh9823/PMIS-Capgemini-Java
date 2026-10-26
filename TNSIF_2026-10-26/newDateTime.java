
import java.time.LocalDateTime;
public class newDateTime {
    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Extract date and time components
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        // System.out.println(year);
        // System.out.println(month);
        // System.out.println(day);
        // System.out.println(hour);
        // System.out.println(minute);
        // System.out.println(second);

        // Create a custom date and time
        LocalDateTime customDateTime1 =
                LocalDateTime.of(2026, 10, 26, 11, 27, 45);
        System.out.println(customDateTime1);

        // Create date and time using extracted values
        LocalDateTime customDateTime2 =
                LocalDateTime.of(year, month, day, hour, minute, second);
        System.out.println(customDateTime2);

        // Parse a date-time string
        LocalDateTime ldt =
                LocalDateTime.parse("2026-10-26T11:31:55");
        System.out.println(ldt);
    }
}
