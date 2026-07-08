public class Qtions {
    public static void SerchEli(int matrix[][]){
        int count = 0;

        for(int i =0 ; i < matrix.length;i++){
            for(int j = 0 ; j <matrix[0].length;j++){
                if (matrix[i][j] == 7) {
                    count++;
                    
                }
            }

        }
        System.out.println(count);
    }

    public static void SumOfNums(int matrix[][]){
        int sum = 0;
            for(int col =0 ;col < matrix[1].length;col++){
                sum = sum + matrix[1][col];
                
            }
            System.out.println(sum);
        }
        
    
    

    

     public static void main(String[] args) {
        int matrix[] [] =   {{1,4,9},
                            {11,4,3},
                            {2,2,3}}; 
                            SumOfNums(matrix) ;
     }                        
     
}
    
     

        
                                   


                    