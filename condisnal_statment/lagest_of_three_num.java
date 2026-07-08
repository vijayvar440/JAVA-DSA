import java.util.Scanner;

public class lagest_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr your Num A = ");
        int A = sc.nextInt();
        System.out.println("enetr your Num B = ");
        int B = sc.nextInt();
        System.out.println("enetr your Num C = ");
        int C = sc.nextInt();

        if (A<=C && A >= C){
            System.out.println("largest NUmber is " + A);
        }
        else if (B >= C){
            System.out.println("largest Number is  "+ B);
        }
        else{
            System.out.println("Largest Number is  " + C);
        }




    }
}


