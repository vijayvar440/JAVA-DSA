package Fuction_second_time;

import java.util.Scanner;

public class product {

    public static void product(int number1 , int number2){

        int sum = number1 * number2;
        System.out.println("Your sum is = "+ sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number  A = ");
        int a = sc.nextInt();
        System.out.println("Enter your First Number  B = ");
        int b = sc.nextInt();
        product(b, b);

        
    }
}
