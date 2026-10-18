import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        byte b = (byte) number;
        System.out.println("The byte value is: " + b);
        scanner.close();
    }
}