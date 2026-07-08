
import java.util.*;





public class bio_cop {

    public static int factroril(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int biocoff(int n ,int r) {
        int fact_n = factroril(n);

        int fact_r = factroril(r)  ;
        int fact_nmr = factroril(n-r)  ;


         int  biocoff= fact_n/(fact_r*fact_nmr) ;
         return biocoff;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
         System.out.println(biocoff (n,r));
    }

}