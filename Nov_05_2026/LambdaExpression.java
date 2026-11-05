
interface Greeting {

    void sayHello();
}

public class LambdaExpression {

    public static void main(String[] args) {
        Greeting g = () -> {
            System.out.println("Hello, Java");
        };
        g.sayHello();
    }
}
