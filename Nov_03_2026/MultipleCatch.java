
public class MultipleCatch {

    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println(numbers[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
