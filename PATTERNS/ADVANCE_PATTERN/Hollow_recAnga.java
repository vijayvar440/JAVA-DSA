package corejava.PATTERNS.ADVANCE_PATTERN;

public class Hollow_recAnga {
    public static void Hollow_rectAnga(int total_row ,int total_col){
        for(int i = 1; i <= total_row; i++){
            for(int j = 1; j<= total_col;j++ ){
                if(i==1 || i == total_row || j ==1 ||j==total_col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



public static void INVERTED_PYRAMI(int n){
    for(int i= 1;i<=n;i++){
        for(int j = 1; j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }

    
    public static void main(String[] args) {
        // Hollow_rectAnga(5, 5);
        INVERTED_PYRAMI(5);
        

    }
}
