
import java.time.LocalDate;
import java.util.Scanner;

public class DateExplorer {

    static LocalDate date;

    static void displayMonth() {
        System.out.println("Month: " + date.getMonth());
    }

    static void displayYear() {
        System.out.println("Year: " + date.getYear());
    }

    static LocalDate lookBackMonths(int months) {
        return date.minusMonths(months);
    }

    static void displayDateInformation() {
        displayMonth();
        displayYear();
        System.out.println("Day of week: " + date.getDayOfWeek());
    }

    static void checkLeapYear() {
        int year = date.getYear();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        date = LocalDate.parse(sc.next());

        int choice;

        do {
            System.out.println("\n1. Look back by months");
            System.out.println("2. Display date information");
            System.out.println("3. Check leap year");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of months: ");
                    int months = sc.nextInt();
                    System.out.println("New date: " + lookBackMonths(months));
                    break;

                case 2:
                    displayDateInformation();
                    break;

                case 3:
                    checkLeapYear();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Enter 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}
