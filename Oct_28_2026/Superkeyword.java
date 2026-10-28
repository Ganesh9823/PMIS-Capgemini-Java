
class Animal {

    Animal() {
        System.out.println("Animal is constructed");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog is constructor");
    }
}

public class Superkeyword {

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
