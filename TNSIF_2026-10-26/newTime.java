import java.time.LocalTime;
public class newTime {
    public static void main(String[] args) {
        LocalTime now  = LocalTime.now();
        System.out.println(now);


        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        
        LocalTime customtime1 = LocalTime.of(11, 27, 45);
        System.out.println(customtime1);
        LocalTime customtime2 = LocalTime.of(hour, minute, second);
        System.out.println(customtime2);
        LocalTime lt = LocalTime.parse("11:31:55");
        System.out.println(lt);
    }
}
