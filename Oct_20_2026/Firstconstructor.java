
class Car {

    String brand;

    Car(String b) {
        brand = b;

    }

    void display() {
        System.out.println(brand);

    }
}

public class Firstconstructor {

    public static void main(String[] args) {
        Car car1 = new Car("Honda");
        Car car2 = new Car("Toyota");
        car1.display();
        car2.display();

    }
}
