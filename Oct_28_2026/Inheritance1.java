
class Animal {

    void eating() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance1 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eating();
    }
}
