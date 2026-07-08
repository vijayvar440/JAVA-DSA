import java.util.Scanner;

public class calculatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETR YOUR FIRST NUMBER A = ");
        int A = sc.nextInt();
        System.out.println("ENTER YOUR SECOND NUMBER B = ");
        int B = sc.nextInt();
        System.out.println("ENTER YOUR OPERATION (+ - * / )");
        char operatre = sc.next().charAt(0);

        switch (operatre) {
            case '+': System.out.println(A+B);
                break;
            case '-': System.out.println(A-B);
                break;
            case '*' : System.out.println(A*B);
                break;
            case '/' : System.out.println(A/B);
            default:System.out.println("PLSE ENTER THE VALIDE  NUMBER");
                break;
        }


    }
}
