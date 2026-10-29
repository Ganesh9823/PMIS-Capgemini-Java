
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");

    }
}

public class Polymorphism2 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
