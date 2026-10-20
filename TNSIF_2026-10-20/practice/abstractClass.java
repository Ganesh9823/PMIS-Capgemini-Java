abstract class animal {
    abstract void sound();
}
class dog extends animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class cat extends animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.sound();
        c.sound();
    }
}
