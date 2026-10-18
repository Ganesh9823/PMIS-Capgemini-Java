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
