import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDate;
import java.util.Scanner;
public class MeetingTimeAssistant {
//     Problem statement - 2
// Create a Java console application called MeetingTimeAssistant that allows a user to enter a meeting's date and time, calculate when it will end, and display the meeting time in a different time zone.

// ========== MEETING TIME ASSISTANT ==========

// Enter meeting date (yyyy-MM-dd): 2026-11-10
// Enter meeting time (HH:mm): 14:30
// Enter meeting duration in minutes: 90

// Choose an option:
// 1. Display meeting date and time
// 2. Display meeting end time
// 3. Display meeting time in another zone
// 4. Check whether the meeting is in the future
// 5. Exit

// Enter choice: 2

// Meeting starts at: 10 Nov 2026, 02:30 PM
// Meeting ends at:   10 Nov 2026, 04:00 PM
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
    System.out.println("========== MEETING TIME ASSISTANT ==========");
    System.out.println("Enter meeting date (yyyy-MM-dd): ");
    String str1 = sc.next();
    LocalDate nowD = LocalDate.parse(str1);
    System.out.println("Enter meeting time (HH:mm): ");
    String str2 = sc.next();
    LocalTime nowT = LocalTime.parse(str2);
    System.out.println("Enter meeting duration in minutes: ");
    int duration = sc.nextInt();
    
    }catch(Exception e){
        System.out.println("Something went wrong ...");
    }
    int s;
    do{
        System.out.println("Choose an option : ");
        System.out.println("\n1. Display meeting date and time");
        System.out.println("2. Display meeting end time");
        System.out.println("3. Display meeting time in another zone");
        System.out.println("4. Check whether the meeting is in the future");
        System.out.println("5. Exit");
        s = sc.nextInt();
        switch(s){
            case 1:
                LocalDate today = LocalDate.now();        
                System.out.println("The date is : " + today);
                LocalTime
                break;
            case 2:

        }
    }while(s!=5);
    

}
}
