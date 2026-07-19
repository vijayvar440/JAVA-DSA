public class power {
    public   static int PowerFuc(int x ,int n){

        if (n == 1) {
            return x;
            
        }
        return x*PowerFuc(x,n-1);
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(PowerFuc(x,1));
    }
}
