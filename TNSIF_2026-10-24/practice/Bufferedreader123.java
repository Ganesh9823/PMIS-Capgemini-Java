package practice;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferedreader123 {
    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(str);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        String st = bf.readLine();
        System.out.println(st);
    }
}