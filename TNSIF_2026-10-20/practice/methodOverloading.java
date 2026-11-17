class methodOverloading123 {    
    // Overloaded method for adding two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method for adding two doubles
    public static double add(double a, double b) {
        return a + b;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading Example");
        methodOverloading123 obj = new methodOverloading123();
        // Calling the overloaded methods
        int sum1 = obj.add(5, 10);
        double sum2 = obj.add(5.5, 10.5);
        
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}
