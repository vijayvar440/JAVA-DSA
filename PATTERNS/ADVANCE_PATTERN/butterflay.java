package corejava.PATTERNS.ADVANCE_PATTERN;

public class butterflay {
    public static void butterflaypttern (int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <=i ; j++){
                System.out.print("0");
            }
            for(int j =1; j <=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n ; i >= 1 ; i--){
            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            for(int j =1; j <=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("0");
            }
            System.out.println();
        }

        

    }


    public static void slolid (int n){
        for(int i =1;i<=n; i++){
            for(int j =1 ; j <=(n-i);j++ ){
                System.out.print(" ");
            }
            for(int j =1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       slolid(10);
    }
}
