import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your numbr  = ");
        int number = sc.nextInt();
        for(int  line= 1 ; line <=number; line++){
            for(int num = 1; num <= line ; num ++){
                System.out.print(num);
            }
            System.err.println();

        }
    }
}