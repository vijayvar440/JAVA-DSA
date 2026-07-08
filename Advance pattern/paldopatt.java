
public class paldopatt {

    public static void disanding_asending_pallodo_pattern(int n) {
        //outre loop
        for (int i = 1; i <= n; i++) {
            //iner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            //disanding 
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            //assending

            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        disanding_asending_pallodo_pattern(5);
    }

}
