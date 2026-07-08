public class add_p{
    public static void hollw_rectangal(int row,int coll) {
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <=coll; j++) {
                if(i==1||i==row||j==1||j==coll){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
         System.out.println();
        }
        
    }

       public static void solid_romwas(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
           
       }



       public static void hollow_rombuse(int n){
        for (int  i = 1;  i <= n;  i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");  
                
            }

            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();   
        }
           
       }




    public static void main(String[] args) {
        // // hollw_rectangal(5,6);
        // hollow_romwas(5); 
        hollow_rombuse(5);  
    }
}
