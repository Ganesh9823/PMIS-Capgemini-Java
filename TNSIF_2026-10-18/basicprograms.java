//this keyword in java

class thiskeyword {
    int a;
    int b;
    int n;
    thiskeyword(int a, int b){
        this.a = a;
        this.b = b;//here a and b are instance variables and this.a and this.b are local variables. so we need to use this keyword to refer to instance variable.
    }
    thiskeyword(int n){
        n = n; //here n is local variable and this.n is instance variable. so we need to use this keyword to refer to instance variable.
    }
    void display(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("n : " + n);
    }
    
}
public class basicprograms {
    public static void main(String[] args) {
        thiskeyword obj = new thiskeyword(10, 20);
        thiskeyword obj2 = new thiskeyword(12);
        obj.display();
    }
}



// every class extends object class
class A extends Object{
    A(){
        super(); //here super is calling the constructor of the parent class Object. so we need to use super keyword to refer to parent class constructor.
        System.out.println("A class constructor");
    }
    A(int n){
        super();
        System.out.println("A class constructor with int parameter : " + n);
    }
}
class B extends A{
    B(){
        super(7);//here even if we don't call super(); it'll still be executed
        System.out.println("B class constructor");
    }
    B(int n){
        
        this(); //here this is calling the constructor of the same class B. so we need to use this keyword to refer to the constructor of the same class.
        System.out.println("B class constructor with int parameter : " + n);
    }
}
public class basicprograms {

    public static void main(String[] args) {
        B b = new B(10);
        //B b2 = new B();
    }
}



