package practice;

public class exceptionhandling {
    static void main(String[] args) {
        int P = 0;//19;
        int S = 19;//0;
        try{
            S = P/S;
            if(S==0) {
                throw new Exception();//ArithmeticException();
            }
        }catch (ArithmeticException e){
            S = 1;
            System.out.println("The default o/p is : ");
        } catch (Exception e) {
            System.out.println("The o/p is : ");
            S=19;

        }
        System.out.println(S);
    }
}