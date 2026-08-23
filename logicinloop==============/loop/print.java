import java.util.Scanner;

public class print {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int m = sc.nextInt();
        int i =1;

        // while (i< 10) {
        //     System.out.print(i+ " ");
        //     i++;
            
        // }

        for(int j=i;j<m;j++){
            System.out.println(j+" ");
        }
    }
}
