
import java.util.*;



public class prime_notp{
    public static boolean isprime(int n) {
        // System.out.println("your number is ");
        boolean isprime = true;
        for (int i = 2; i <= n-1; i++) {
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }  
    
           public static void primeisrenge(int n ) {
            for (int i = 0; i <= n; i++) {
                if(isprime(i)){
                    System.out.print(i + " ");
                }
            }
               
           }
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        primeisrenge(n);
        
    }
    
}