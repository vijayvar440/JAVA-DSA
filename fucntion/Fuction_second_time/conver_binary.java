package Fuction_second_time;

public class conver_binary {
    public static void binToDc(int binNUM){
         int myNum = binNUM;
         int  pow = 0;
         int dec = 0;
         while (binNUM > 0) {
            int lstDigit = binNUM % 10;
            dec = dec +(lstDigit*(int)Math.pow(2,pow));
            pow++;
            binNUM = binNUM/10;
         }
         System.out.println("Decimal of " + myNum + "  =  " + dec);
     

    }



    public static void main(String[] args) {
      
        binToDc(101);


    }
 



}

// 0 = 0
// 1 = 01
// 2 = 10
// 3 = 11
// 4 = 100
// 5 = 101
// 6 = 110
// 7 = 111
// 8 = 1000
