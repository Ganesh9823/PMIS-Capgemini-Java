import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.Scanner;

class dataTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        availableZones.forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        try{
            
            ZoneId zid = ZoneId.of(str);
            ZonedDateTime zdt = ZonedDateTime.now(zid);
            System.out.println(zid);
            System.out.println(zdt);
        }catch(Exception e){
            System.out.println("Something went wrong!!!");
        }
        sc.close();
    }
}