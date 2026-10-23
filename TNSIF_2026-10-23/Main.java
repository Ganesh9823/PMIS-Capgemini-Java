import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/online_shopping_db";
        String username = "root";
        String password = "Pkm@123";

        if (username == null || username.isBlank() || password == null || password.isBlank()) {
            System.err.println("Set the MYSQL_USER and MYSQL_PASSWORD environment variables.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Connected to online_shopping_db.");

            boolean running = true;
            while (running) {
                System.out.println("\n1. Add customer");
                System.out.println("2. List customers");
                System.out.println("3. Update customer");
                System.out.println("4. Delete customer");
                System.out.println("0. Exit");

                int choice = readInt(scanner, "Choose an operation: ");
                switch (choice) {
                    case 1:
                        addCustomer(connection, scanner);
                        break;
                    case 2:
                        listCustomers(connection);
                        break;
                    case 3:
                        updateCustomer(connection, scanner);
                        break;
                    case 4:
                        deleteCustomer(connection, scanner);
                        break;
                    case 0:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Choose 0 through 4.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Database operation failed: " + e.getMessage());
        }
    }

    private static void addCustomer(Connection connection, Scanner scanner) throws SQLException {
        String sql = "INSERT INTO customers (customer_name, email, phone, city) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, readLine(scanner, "Customer name: "));
            statement.setString(2, readLine(scanner, "Email: "));
            statement.setString(3, readLine(scanner, "Phone (optional): "));
            statement.setString(4, readLine(scanner, "City (optional): "));
            System.out.println(statement.executeUpdate() + " customer added.");
        }
    }

    private static void listCustomers(Connection connection) throws SQLException {
        String sql = "SELECT customer_id, customer_name, email, phone, city FROM customers ORDER BY customer_id";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet results = statement.executeQuery()) {
            while (results.next()) {
                System.out.printf("%d | %s | %s | %s | %s%n",
                        results.getInt("customer_id"),
                        results.getString("customer_name"),
                        results.getString("email"),
                        results.getString("phone"),
                        results.getString("city"));
            }
        }
    }

    private static void updateCustomer(Connection connection, Scanner scanner) throws SQLException {
        int customerId = readInt(scanner, "Customer ID to update: ");

        System.out.println("1. Update name");
        System.out.println("2. Update email");
        System.out.println("3. Update phone");
        System.out.println("4. Update city");
        int fieldChoice = readInt(scanner, "Choose a field: ");

        String column;
        String prompt;
        switch (fieldChoice) {
            case 1:
                column = "customer_name";
                prompt = "New name: ";
                break;
            case 2:
                column = "email";
                prompt = "New email: ";
                break;
            case 3:
                column = "phone";
                prompt = "New phone: ";
                break;
            case 4:
                column = "city";
                prompt = "New city: ";
                break;
            default:
                System.out.println("Invalid field choice.");
                return;
        }

        String value = readLine(scanner, prompt);
        String sql = "UPDATE customers SET " + column + " = ? WHERE customer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, value);
            statement.setInt(2, customerId);
            int updated = statement.executeUpdate();
            System.out.println(updated == 0 ? "No customer found with that ID." : "Customer updated.");
        }
    }

    private static void deleteCustomer(Connection connection, Scanner scanner) throws SQLException {
        int customerId = readInt(scanner, "Customer ID to delete: ");
        String sql = "DELETE FROM customers WHERE customer_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, customerId);
            System.out.println(statement.executeUpdate() + " customer deleted.");
        }
    }

    private static String readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readLine(scanner, prompt));
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }
}