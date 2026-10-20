import tool.calc;
import tool.advCalc;

public class demo {
    public static void main(String[] args) {
        calc c = new calc();
        advCalc ac = new advCalc();

        System.out.println(c.add(10, 20));
        System.out.println(ac.multiply(10, 20));
    }
}