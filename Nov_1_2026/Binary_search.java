
public class Binary_search {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                System.out.println("Element found at index:" + mid);
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
