
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] arhs) {
        try {
            File file = new File("student.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
