import java.util.Scanner;

public class QTION_IN {
    public static void main(String[] args) {
        //qtion 1
        // Scanner sc =  new Scanner(System.in);
        // System.out.println("enter your first numbr ");
        // int a = sc.nextInt();
        // System.out.println("enter your second numbr ");
        // int b = sc.nextInt();
        // System.out.println("enter your therd  numbr ");
        // int c = sc.nextInt();

        // int ave = (a+b+c)/3;
        // System.out.println("this is your Average NUmber " + ave);




        //qtion 2

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enetr your squre  ");
        // int said = sc.nextInt();
        // int are_of_squre = said * said;
        // System.out.println("area of squre ");
        // System.out.println(are_of_squre);

        // qtion number 4

        // Scanner sc = new Scanner(System.in);
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 100;
        // float f = 3.14f;
        // double d = 99.9954;

        // double result = (f*b)+(i%c)-(d*s);
        // System.out.println(result);


        Scanner sc = new Scanner(System.in);
        System.out.println("enetr prize of pensil = ");
        float pencil = sc.nextFloat();
        System.out.println("prize of pene = ");
        float pen = sc.nextFloat();
        System.out.println("enetr prize of eresar = ");
        float eresar = sc.nextFloat();

        float orginal_prize = (pencil + pen + eresar);
        System.out.println("orginalprize = " + orginal_prize);

        System.out.println("After 18% gist ");
        float gist = (orginal_prize/100)*18;
        System.out.println(gist);




    }
}
