
public class Linear_search {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index:" + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array");
        }
    }
}
