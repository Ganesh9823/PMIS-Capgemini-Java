public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulus : " + (a % b));
        System.out.println();



        // Relational
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println();


        // Logical
        boolean x = true;
        boolean y = false;

        System.out.println("Logical AND : " + (x && y));
        System.out.println("Logical OR : " + (x || y));
        System.out.println("Logical NOT : " + (!x));
        System.out.println();



        //unary
        int k = 12; int j = 11;
        System.out.println("Unary Increment : " + (++k));
        System.out.println("Unary Increment : " + (j++));
        System.out.println();

        System.out.println("New value of j : " + (j));
        System.out.println("New value of k : " + (k));
        System.out.println();

        System.out.println("Unary Decrement : " + (--k));
        System.out.println("Unary Decrement : " + (j--));
        System.out.println();
        
        System.out.println("New value of j : " + (j));
        System.out.println("New value of k : " + (k));
    }
}
