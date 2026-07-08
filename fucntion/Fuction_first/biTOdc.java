
import java.util.*;

    // public class biTOdc{
    //     public static void bitodc (int n) {
    //         int mynum = n;
    //         int pow = 0;
    //         int decNum= 0;
    //         while(n>0){
    //             int lastdigt = n%10;
    //             decNum = decNum + (lastdigt * (int)Math.pow(2, pow));
              
    //             pow++;
    //             n = n/10;
    //         }
    //         System.out.println("decimal of " + mynum+ " = "+ decNum);
    //     }
    //     public static void main(String[] args) {
    //         bitodc(1010);
    //     }
    // }
public  class biTOdc{
    public static void binTodec(int binum) {
        int mynum = binum;
        int pow = 0;
        int dec = 0;
        while(binum>0){
         int lastdigit = binum%10;
         dec = dec + ( lastdigit* (int)Math.pow(2,pow));
         pow++;
         binum = binum/10;
        }
        System.out.println("dcmal is "+ mynum + " = "+ dec);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your binarey numer");
        int n  = sc.nextInt();
        binTodec(n);
    }
}
    