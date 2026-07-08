package corejava.PATTERNS.ADVANCE_PATTERN;

public class number_pyramid {

    public static void HALF_number_pyraamid(int n){
        for(int i = 1; i<= n ; i++){
            for(int j = 1; j <= n-i+1; j++ ){
                System.out.print(j+"");
            }
            System.out.println();

        }
        
    }
    public static void main(String[] args) {
        HALF_number_pyraamid(10);
         
    }
}

// 7697680962