import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
<<<<<<< HEAD
=======
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
>>>>>>> feature1
        for (int i = 1; i <= 5; i++) {
            System.out.println("This is line " + i);
        }
    }
}
