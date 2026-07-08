
import java.util.*;


// import java.util.*;

// public class q {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your first number");
//         double x = sc.nextDouble();
//         System.out.println("enter your second number");
//         double y = sc.nextDouble();

//         System.out.println("enter your therd number");
//         double z = sc.nextDouble();

//     System.out.println(avr(x, y, z));
        
//     }

//         public static double avr(double x, double y, double z) {
//             return (x+y+z) / 3; 
            
//         }

//     }
    
    
public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        
    }
    public static boolean isven(int num) {
        if (num%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void testIsven() {
        System.out.println(isven(5));
    }

}