import java.util.Scanner;

public class odd_even {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age = ");
    int age   = sc.nextInt();

    if(age >= 18){
        System.out.println("Adult");
    }
    else if (age >= 13 && age < 18){
        System.out.println("teenAger");
    }else{
        System.out.println("child");
    }
 }
}
