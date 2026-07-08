

public class Dcresing {

    public static void Decresing(int n){
        if(n==1){
            System.out.println(1);
            return;

        }

        System.out.println(n);
        Decresing(n-1);

    }
    

    public static void main(String[] args) {
        int n = 10;
        Decresing(n);

        
    }

}
