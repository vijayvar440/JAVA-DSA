import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int num = 1 ;
        while (num <= number ) {
            System.out.println(num);
            num++;
            
        }
    }
}
