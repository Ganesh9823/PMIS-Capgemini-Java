package practice;

public class wrapperclass {
    static void main(String[] args) {
        int num = 7;
        Integer number = num; //auto-boxing
        Integer number123 = new Integer(num);//boxing
        Integer num1 = 27;
        int num123 = num1.intValue();//unboxing
        int number1 = num1;//auto-unboxing
        System.out.println(num + " " + num1);
    }
}