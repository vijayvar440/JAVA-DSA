import java.util.Scanner;

public class terenay_operatre {
    public static void main(String[] args) {
        // int a = 5;
        // String type = ((a%2)==0) ? "even" : "odd";
        // System.out.println(type);
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
         
        String Result = ((marks >= 33) ? "pass" : "FAILE");
            System.out.println(Result);
        
    }
}    