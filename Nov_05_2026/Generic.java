
class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class Generic {

    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>();
        b1.setValue(100);
        Box<String> b2 = new Box<>();
        b2.setValue("Java");
        Box<String> b3 = new Box<>();
        b3.setValue("Programming");
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());
    }
}
