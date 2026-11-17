abstract class animal {//this is an abstract class which is just a blueprint of the class. we can't create an object of this class. we can only extend it to other classes.
    abstract void sound();
    public void walk() {
        System.out.println("Animal walks");
    }
    animal() {
        System.out.println("Animal constructor");//this constructor will be called first when we create an object of the child class.
    }
}
class dog extends animal {
    void sound() {
        System.out.println("Dog barks");
    }
    dog() {
        System.out.println("Dog constructor");//constructor chaining will happen here. first the constructor of the parent class will be called and then the constructor of the child class will be called.
    }
}
class cat extends animal {
    void sound() {
        System.out.println("Cat meows");
    }
    cat() {
        System.out.println("Cat constructor");//constructor chaining will happen here. first the constructor of the parent class will be called and then the constructor of the child class will be called.
    }
}

public class abstractClass {
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        d.sound();
        c.sound();
        d.walk();
        c.walk();
    }
}
