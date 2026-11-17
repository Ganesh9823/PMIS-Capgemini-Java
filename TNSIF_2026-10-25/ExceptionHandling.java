import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        demonstrateArithmeticException();
        demonstrateMultipleCatch();
        demonstrateNumberFormatException();
        demonstrateFinally();
        demonstrateThrowAndThrows();
        demonstrateTryWithResources();
    }

    private static void demonstrateArithmeticException() {
        System.out.println("\n1. Handling division by zero:");
        int numerator = 18;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }
    }

    private static void demonstrateMultipleCatch() {
        System.out.println("\n2. Handling different exceptions:");
        int[] numbers = {10, 20, 30};
        int index = 5;

        try {
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The requested array index does not exist.");
        } catch (RuntimeException exception) {
            System.out.println("A runtime error occurred: " + exception.getMessage());
        }
    }

    private static void demonstrateNumberFormatException() {
        System.out.println("\n3. Handling invalid number input:");
        String input = "12x";

        try {
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException exception) {
            System.out.println("\"" + input + "\" is not a valid integer.");
        }
    }

    private static void demonstrateFinally() {
        System.out.println("\n4. Using finally:");
        Scanner scanner = new Scanner("example input");

        try {
            System.out.println("Read: " + scanner.nextLine());
        } catch (RuntimeException exception) {
            System.out.println("Could not read the input.");
        } finally {
            scanner.close();
            System.out.println("Cleanup runs whether an exception occurs or not.");
        }
    }

    private static void demonstrateThrowAndThrows() {
        System.out.println("\n5. Throwing and declaring a custom checked exception:");

        try {
            validateAge(15);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException exception) {
            System.out.println("Validation failed: " + exception.getMessage());
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }

    private static void demonstrateTryWithResources() {
        System.out.println("\n6. Using try-with-resources:");

        try (BufferedReader reader = new BufferedReader(new StringReader("Hello from a resource."))) {
            System.out.println(reader.readLine());
        } catch (IOException exception) {
            System.out.println("Could not read the resource: " + exception.getMessage());
        }
    }

    private static class InvalidAgeException extends Exception {
        private InvalidAgeException(String message) {
            super(message);
        }
    }
}
