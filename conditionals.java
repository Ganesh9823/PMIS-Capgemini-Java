// public class conditionals {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 14;
//         int c = 16;
//         int d = 18;
//         if(a>b && a>c && a>d){
//             System.out.println("largest of four is a : " + a);
//         }
//         else if(b>a && b>c && b>d){
//             System.out.println("largest of four is b : " + b);
//         }
//         else if(c>a && c>b && c>d){
//             System.out.println("largest of four is c : " + c);
//         }
//         else {
//             System.out.println("largest of four is d : " + d);
//         }
//     }
// }


// switch case
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
