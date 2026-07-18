public class printsum {
    public static int printofSum(int n ){
        if (n==1) {
            return 1;
            
        }

        return n+printofSum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printofSum(n));
    }
}
