public class conditionals {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c = 16;
        int d = 18;
        if(a>b && a>c && a>d){
            System.out.println("largest of four is a : " + a);
        }
        else if(b>a && b>c && b>d){
            System.out.println("largest of four is b : " + b);
        }
        else if(c>a && c>b && c>d){
            System.out.println("largest of four is c : " + c);
        }
        else {
            System.out.println("largest of four is d : " + d);
        }
    }
}
