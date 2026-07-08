package QTIONS;

import java.util.Scanner;

public class qtion2 {
   




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enetr your number = ");
        num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("NUmber is even");
            
        }else{
            System.out.println("Number is odd");
        }
    }
     public static boolean isEven(int number){
        if(number%2 ==0 ){
            return true;

        }
        else{
            return false;
        }

    }

  
}
