public class favtorial {
    public static int findFactoria(int n){
        if(n==0){
            return 1;
        }
        int f1 = findFactoria(n-1);
        int fn = n*f1;
        return fn;

    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println( findFactoria(n));
    }
}
