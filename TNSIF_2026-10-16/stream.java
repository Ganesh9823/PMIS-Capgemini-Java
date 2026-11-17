// import java.util.*;
// import java.util.stream.*;
// public class stream {
//         public static void main(String[] args) {
//             List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            
//             // Using stream to filter even numbers and collect them into a list
//             List<Integer> evenNumbers = numbers.stream()
//                                                 .filter(n -> n % 2 == 0)
//                                                 .collect(Collectors.toList());
            
//             System.out.println("Even Numbers: " + evenNumbers);
//         }
// }

// import java.util.*;
// import java.util.stream.*;
// public class stream {
//         public static void main(String[] args) {
//             List<String> list = List.of("a", "b", "c", "d", "e");
            
//             System.out.println("Original List: ");
//             list.stream().forEach(System.out::println);
//             int[] arr = {1, 2, 3, 4, 5};
//             Arrays.stream(arr).forEach(System.out::println);
//             Stream.of("a", "b", "c", "d", "e").forEach(System.out::println);
//             IntStream.range(1, 5).forEach(System.out::println);
//         }
// }




//filter
// import java.util.*;
// import java.util.stream.*;
// public class stream {
//         public static void main(String[] args) {
//             //Filter: keep all the items that pass a defined test
//             List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//             List<Integer> result = numbers.stream()
//                 .filter(num -> num >= 7)
//                 .collect(Collectors.toList());
//             System.out.println(result);                            
            
//         }
// }


//map
// import java.util.*;
// import java.util.stream.*;
// public class stream {
//         public static void main(String[] args) {
//             //Map: transform each item in the stream
//             List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//             List<Integer> result = numbers.stream()
//                 .map(num -> num + 2)
//                 .collect(Collectors.toList());
//             System.out.println(result);                            
            
//         }
// }

//sorted
// import java.util.*;
// import java.util.stream.*;
// public class stream {
//         public static void main(String[] args) {
//             //Sorted: sort the items in the stream
//             List<Integer> numbers = List.of(5, 3, 8, 1, 2);
//             List<String> Words = List.of("apple", "elderberry","banana", "date" , "cherry");
//             List<Integer> result = numbers.stream()
//                 .sorted()
//                 .collect(Collectors.toList());
//             System.out.println(result);
//             List<String> result2 = Words.stream()
//                 .sorted()
//                 .collect(Collectors.toList());
//             System.out.println(result2);                            
            
//         }
// }