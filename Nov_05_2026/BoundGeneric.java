
class NumberBox<T extends Number> {

    T value;

    NumberBox(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value:" + value);
    }
}

public class BoundGeneric {

    public static void main(String[] args) {
        NumberBox<Integer> b1 = new NumberBox<>(100);
        b1.display();
        NumberBox<Double> b2 = new NumberBox<>(3.14);
        b2.display();
        NumberBox<Float> b3 = new NumberBox<>(2.5f);
        b3.display();

    }
}
