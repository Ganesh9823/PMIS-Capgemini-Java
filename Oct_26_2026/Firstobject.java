
public class Firstobject {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Honda";
        car2.brand = "Toyota";

        System.out.println(car1.brand);
        System.out.println(car2.brand);
        car1.start();

    }
}

class Car {

    String brand;

    void start() {
        System.out.println("Car is starting");
    }
}
