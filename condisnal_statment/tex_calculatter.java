import java.util.Scanner;

public class tex_calculatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income= sc.nextInt();
        System.out.println("Your income is = " + income);
        int tex ;
        if(income <500000){
            tex = 0;

        }
        else if (income >= 50000 && income < 1000000 ){
            tex = (int)(income * 0.2);
        }
        else{
            tex = (int)(income*0.3);
        }

        System.out.println("your tex is = " + tex );
    }
}
