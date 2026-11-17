
public class Sorting {

    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
