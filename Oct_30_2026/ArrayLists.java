
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");

        System.out.println(names);

        System.out.println(names.get(0));
        names.remove("Priya");

        System.out.println(names);
    }
}
