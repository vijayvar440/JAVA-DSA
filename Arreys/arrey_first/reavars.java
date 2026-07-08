
public class reavars {

    public static void revarse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            int tmap = number[last];
            number[last] = number[first];
            number[first] = tmap;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        revarse(number);
        for (int i = 0; i <number.length; i++) {
            System.out.println(" "+ number[i]);
            
        }

    }
}
