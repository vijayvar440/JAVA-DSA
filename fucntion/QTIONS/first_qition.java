package QTIONS;

import java.util.Scanner;

public class first_qition {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your First NUm = ");
        int a = sc.nextInt();
        System.out.println("Enetr your second NUm = ");
        int b = sc.nextInt();
        System.out.println("Enetr your Therd NUm = ");
        int  c = sc.nextInt();
        int  aveg = ((a+b+c)/3);

        System.out.println("Your average num id = " + aveg);


    }
    public static double Average(double x, double y , double z){
        return(x+y+z)/3;
    }
}
