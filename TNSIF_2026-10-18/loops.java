import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        //for loop
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
        //while loop
        int i=1;
        while (i<=n) {
            System.out.println(i);
            i++;
        }
        //do while loop
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
