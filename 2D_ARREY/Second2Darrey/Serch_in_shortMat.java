public class Serch_in_shortMat {
    public static boolean Shortmtrix(int marix[][],int key){
        int row = 0;
        int col = marix[0].length-1;

        while (row < marix.length && col >= 0) {
            if (marix[row][col] == key) {
                System.out.println("found key at (" + row + " ," + col + " )");
                return true;
                
            }
            else if (key < marix[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("Key Not found!");
        return false;
        
    }




    public static void main(String[] args) {
        
        int matrix[][] = {{10,20,30,40},
                           {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        int key = 33;
        Shortmtrix(matrix,key);
    }
}
