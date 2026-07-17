
public class decnumber {
    public static void decnumber(int n){
        if (n==1) {
            System.out.println(n);
            return ;
            
        }
        System.out.println(n);
        decnumber(n-1);
    }
    public static void main(String[] args) {

        int n = 10;
        decnumber(n);
        
    }
}
