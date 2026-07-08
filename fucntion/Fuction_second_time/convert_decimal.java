package Fuction_second_time;

public class convert_decimal {

    public static void decToBin(int n){
        int mayNum = n;
        int pow = 0;
        int binNUm = 0;


        while (n>0) {
            int rem = n % 2;
            binNUm =  binNUm + (rem* (int)Math.powExact(10, pow));
            pow++;
            n = n/2;
            
        }
        System.out.println("Binary form of "+ mayNum + "  =  "+ binNUm);
    }
    public static void main(String[] args) {
        decToBin(15);
         
    }
}
