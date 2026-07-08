public class power {
    public static int power(int x ,int n){
        if(n == 0){
            return 1;
        }

        int Xm1 = power(x, n-1);
        int xn = x * Xm1;
        return xn;

    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        
    }
}