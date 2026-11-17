interface Animal {
    // void eat(){} // inside interface we can only declare abstract methods. we can't define the body of the method. if we want to define the body of the method then we have to use default keyword.
   abstract void sleep();// abstract keyword is optional. by default all methods inside interface are abstract.
   public void eat();// public keyword is optional. by default all methods inside interface are public.
}
class Horse implements Animal,herbivore {//multiple inheritance
    public void sleep() {//if we don't write public we Cannot reduce the visibility of the inherited method from Animal
        System.out.println("Horee sleeps");
    }
    public void eat() {//if we don't write public we Cannot reduce the visibility of the inherited method from Animal
        System.out.println("Horse eats");
    }
}
interface herbivore {

}
public class interfaces {
    
}
