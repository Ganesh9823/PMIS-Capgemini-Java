
import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, ("Rahul"));
        students.put(202, ("Priya"));
        students.put(303, ("Mira"));

        System.out.println(students.get(202));
        System.out.println(students.containsKey(202));
    }
}
