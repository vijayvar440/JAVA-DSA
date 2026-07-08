

public class factrorial {
    public static int FindFct(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * FindFct(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(FindFct(n));
    }
}
