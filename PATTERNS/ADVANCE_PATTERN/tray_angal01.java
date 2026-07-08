package corejava.PATTERNS.ADVANCE_PATTERN;

public class tray_angal01 {
    public static void tryangal(int n){
        for(int i =1 ; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2==0){
                    System.out.print("0"+ " ");
                }else{
                    System.out.print("1"+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tryangal(5);
        
    }
}
