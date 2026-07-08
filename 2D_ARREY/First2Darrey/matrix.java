
import java.util.Scanner;

public class matrix {

    public static boolean serch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found thi coll = " + i + " " + j);
                    return true;
                }
            }

        }
        System.out.println(" not found");
        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
      
      serch(matrix, 5);
    }
     

}
