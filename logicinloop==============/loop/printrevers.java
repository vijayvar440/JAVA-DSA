import java.util.Scanner;

public class printrevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        // int i = m;

        // while (i >= 1) {
        //     System.out.print(i + " ");
        //     i--;
        // }

        for(int i = m ;i>=1; i-- ){
            System.out.println( i+ " ");
        }
    }
}