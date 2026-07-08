package Fuction_second_time;

import java.util.Scanner;

public class para_func {
    public static int calculatsum(int num1,int num2 ){
        int sum = num1 + num2;
        return sum;
        // System.out.println("your sum is  = "+sum);


    };



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  numbr A  = ");
        int a =  sc.nextInt();
        System.out.println("Enetr your number B =  ");
        int b  = sc.nextInt();
        int sum = calculatsum(a, b);
        System.out.println("your sum is  = "+sum);
        calculatsum(a, b);
        
    }
}
