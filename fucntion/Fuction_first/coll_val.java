public class coll_val{
     public static void swap( int a , int b ) {
       
         
         int temp = a;
         a = b;
            b = temp;
         System.out.println("Value of a: " + a);
         System.out.println("Value of b: " + b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        swap(a, b);
    }
}