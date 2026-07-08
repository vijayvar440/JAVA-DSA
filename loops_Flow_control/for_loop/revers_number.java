package for_loop;

import java.util.Scanner;

public class revers_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        while (n>0) {
           int  latgisit = n%10;
           System.out.print(latgisit + " ");
           n = n/10;   
        }
        System.out.println();
    }
}
