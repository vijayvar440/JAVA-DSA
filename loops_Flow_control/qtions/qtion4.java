package qtions;

import java.util.Scanner;

public class qtion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number  = ");
        int n = sc.nextInt();
        int multiplication = 0;
    for(int i = 0; i <= 10 ; i++){
        multiplication = i*n;
        System.out.println(multiplication);
    }
    }
};

