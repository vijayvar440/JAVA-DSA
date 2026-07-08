public class foloid_tra{
    public static void foloid_tra(int n) {
        int countr = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i+1; j++) {
                System.out.print(countr);
                countr++;
                
            }
        System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        foloid_tra(5);
    }

    }
