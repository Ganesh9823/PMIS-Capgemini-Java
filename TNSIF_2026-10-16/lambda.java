// import java.util.*;
// import java.util.function.Predicate;
// import java.util.function.*;




// @FunctionalInterface
// interface Greeter {
//     void greet(String name);
// }

// public class lambda {
//     public static void main(String[] args) {
//         Greeter g = new Greeter() {
//             @Override
//             public void greet(String name) {
//                 System.out.println("Hello " + name);
//             }
//         };

//         g.greet("Bhumi");
//     }
// }




// public class lambda {
//     public static void main(String[] args) {
//         // Lambda expression using Predicate to check if age is 18 or older
//         Predicate<Integer> isAdult = age -> age >= 18;

//         // Testing the predicate with different values
//         System.out.println(isAdult.test(20)); // Prints: true
//         System.out.println(isAdult.test(15)); // Prints: false
//     }
// }






// public class lambda {
//     public static void main(String[] args) {
//         Function<String, Integer> getLength = name -> name.length();
//         System.out.println(getLength.apply("java")); // Prints: 4
//         System.out.println(getLength.apply("lambda")); // Prints: 6
//     }
// }



//wap to calculate square of a number using lambda
// public class lambda {
//     public static void main(String[] args) {
//         Function<Integer, Integer> square = number -> number * number;
//         System.out.println(square.apply(5)); 
//         System.out.println(square.apply(10));
//         System.out.println(square.apply(12)); 
//     }
// }


// //predicate
// import java.util.function.Predicate;
// class lambda {
//     public static void main(String[] args) {
//         Predicate<Integer> isEven = number -> number % 2 == 0;
//         System.out.println(isEven.test(4)); // Prints: true
//         System.out.println(isEven.test(7)); // Prints: false
//     }
// }


//consumers
// import java.util.function.Consumer;
// public class lambda {
//     public static void main(String[] args) {
//         Consumer<String> printName = name -> System.out.println("Hello, " + name);
//         printName.accept("Bhumi");
//         printName.accept("John");
//     }
// }



//supplier
// import java.util.function.Supplier;
// public class lambda {
//     public static void main(String[] args) {
//         Supplier<Double> randomValueSupplier = () -> Math.random();
//         System.out.println(randomValueSupplier.get());
//     }
// }


//supplier for otp generation
// import java.util.function.*;
// import java.util.*;

// public class lambda {
//     public static void main(String[] args) {
//         Random random = new Random();        
//         Supplier<String> otpGen = () -> {
//             int number = 100000 + random.nextInt(900000);
//             return String.valueOf(number);
//         };        
//         String userOtp = otpGen.get();
//         System.out.println("Generated OTP: " + userOtp);
//     }
// }



//stream
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
public class lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(result);
    }
}