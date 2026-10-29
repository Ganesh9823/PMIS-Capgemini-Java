
abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");

    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog is sleeping");

    }
}

public class Abstractkeyword {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }

}
