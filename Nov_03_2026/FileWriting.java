
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Ganesh\n");
            writer.write("Course: Java Programming\n");
            writer.write("Role: Java Intern\n");

            writer.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
