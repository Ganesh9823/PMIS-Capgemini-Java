
import java.util.Scanner;

public class GuessMaster {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number (0-99):");

            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WooHoo! Correct Number");
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }

        } while (userNumber != myNumber);

        System.out.println("My number was: " + myNumber);

        sc.close();
    }
}
