
public class printsub {
    //print sub arrey//

    public static void printsubarrey(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int satrt = i;
            for (int j = 0 ; j < number.length; j++) {
                int end = j;
                for (int k = satrt; k <= end; k++) {
                    System.out.print(number[k] + " ");

                }
                System.out.println();

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        printsubarrey(number);
    }
}
