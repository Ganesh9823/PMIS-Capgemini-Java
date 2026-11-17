
public class BasicDsa {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 46, 60, 80, 103};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("largest number:" + largest);

    }
}
