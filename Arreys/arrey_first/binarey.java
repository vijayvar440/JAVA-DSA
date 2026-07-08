
public class binarey {

    public static int binareyserch(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60};
        int key = 60;
        System.out.println("Element found at index: " + binareyserch(number, key));

    }

}
