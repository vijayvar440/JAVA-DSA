package for_loop;

public class gievn_revers {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while (n>0) {
            int lat_digt = n%10;
            rev = (rev*10)+lat_digt;
             n = n/10;
        }
        System.out.println(rev);
    }
}
