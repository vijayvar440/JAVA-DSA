package QTIONS;

import java.util.Scanner;

public class qtion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plse enter your number = ");
        int Palindrome = sc.nextInt();

        if (isPalindrome(Palindrome)) {
            System.out.println("number :  "+ Palindrome + "  is palidrome");
            
        }
        else{
            System.out.println("number"  + Palindrome + "   is not pelidrome");
        }



        
    }
    public static boolean isPalindrome( int number ){
        int Palindrome = number;
        int reverse = 0;

        while (Palindrome != 0) {
            int remainder =  Palindrome % 10;
            reverse = reverse*10+remainder;
            Palindrome = Palindrome/10;
            
        }
        if (number == reverse) {
            return true;
            
        }
        else{
            return false;
        }

    }
}
