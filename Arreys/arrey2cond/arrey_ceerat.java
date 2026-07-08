package arrey2cond;
import java.util.*;

public class arrey_ceerat {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter your Maths Mraks = ");
        marks[0] = sc.nextInt();
         System.out.print("Enter your Maths Pysics = ");
        marks[1] = sc.nextInt();
         System.out.print("Enter your Chamistry Mraks = ");
        marks[2] = sc.nextInt();

   

        System.out.println("Your math marks = " + marks[0]);
        System.out.println("Your Pysich marks = " + marks[1]);
        System.out.println("Your Camistry marks = " + marks[2 ]);
        int perstange = ((marks[0]+marks[1]+marks[2])/3);
        System.out.print("Your persantage is  = " + perstange + "%");



        
    }
}
