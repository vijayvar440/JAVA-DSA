public class optiMaiz {
    public static int optimaizepower(int a ,int n){
        if (n==0) {
            return a;
            
        }

        int helph =  optimaizepower(a, n/2);

        int helfsqr =  helph*helph;

        if (n%2 != 0) {
            helfsqr = a*helfsqr;
            
        }
        return helfsqr;
    }
    public static void main(String[] args) {
        int a = 2;
        int n  = 5;
       System.out.println( optimaizepower(a, n));
    }
}
