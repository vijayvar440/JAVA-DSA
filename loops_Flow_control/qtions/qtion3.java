package qtions;

import java.util.Scanner;

public class qtion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fct_number = 1;

        for(int i =1 ; i<=num;i++){
            fct_number *= i;
        }
        System.out.println(fct_number);
    }
}
