
public class largest {

    public static int largest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smalest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];

            }
            if (smalest > number[i]) {
                smalest = number[i];
            }

        }
         System.out.println("smalest is = " + smalest);

        return largest;
       
    }

    public static void main(String[] args) {
        int number[] = {10, 40, 50, 70, 80, 90};
        System.out.println("largest number is = " + largest(number));
    }
}
