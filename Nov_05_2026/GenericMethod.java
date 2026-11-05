
public class GenericMethod {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(100);
        display("Java");
        display(3.14);
    }
}
