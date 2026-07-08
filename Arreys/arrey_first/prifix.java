
////prifix sum // max subarray sum 
public class prifix {

    public static void prifixsubarrey(int number[]) {

        int currensum = 0;
        int maxsum = number.length;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];

        }
        for (int i = 0; i < number.length; i++) {
            int satart = i;
            for (int j = i; j < number.length; j++) {
                int end = j;

                currensum = satart == 0 ? prefix[end] : prefix[end] - prefix[satart - 1];

                if (maxsum < currensum) {
                    maxsum = currensum;
                }
            }

        }
        System.out.println("max sum is =" + maxsum);

    }

    public static void kadan(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs+number[i];
            if(cs<0){
                cs = 0;


            }
            ms = Math.max(cs, ms);
            
        }
        System.out.println("max sum is = " + ms);

    }

    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadan(number);
        // prifixsubarrey(number);
    }
}
