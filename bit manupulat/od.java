 // chek odd and even number  
public class od{
    public static void oddORevn(int n) {
        int itmask = 1;
        if((n & itmask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddORevn(3);
        oddORevn(7);
        oddORevn(14);
    }
}