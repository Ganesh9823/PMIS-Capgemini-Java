package practice;

public class Stringbuffer {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//16
        StringBuffer sb2 = new StringBuffer("Parjanya");
        System.out.println(sb2.capacity());//24
        System.out.println(sb.length() + " " + sb2.length());//0 8
    }
}