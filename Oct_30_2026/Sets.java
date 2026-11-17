
import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        System.out.println(numbers);
    }
}
