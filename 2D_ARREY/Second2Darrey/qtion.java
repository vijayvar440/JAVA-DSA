// public class qtion {
//     public static void main(String[] args) {
//         int row =2;
//         int col = 3;
//         int[][] matrixx = {{2,3,7},
//                           {5,6,7}} ;


//         printMatrix(matrixx);


//         int [][] transpose =  new int[col][row];
//         for(int i =0; i < row ;i++){
//             for(int j=0;  i < col; j++){
//                 transpose[j][i] = matrixx[i][j];
//             }

//         }
//         printMatrix(transpose);
        
//     }

//     public static void printMatrix(int[][] matrix){
//         System.out.println("The matrix is:  ");
//         for(int i =0; i < matrix.length;i++){
//             for(int j =0 ; j < matrix[0].length;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }





public class qtion {
    public static void main(String[] args) {

        int row = 2;
        int col = 3;

        int[][] matrix = {
            {2, 3, 7},
            {5, 6, 7}
        };

        // Transpose matrix banega col x row size ka
        int[][] transpose = new int[col][row];

        // Transpose logic
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print result
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

