package statemmt;

import java.util.Scanner;

public class qtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

    //    do{
    //     System.out.println("enetr your number ");
    //     int user =  sc.nextInt();
    //     if(user % 10 == 0){
    //         break;
    //     }
    //     System.out.println(user);
    //    }while(true);
    // do{
    //     int n = sc.nextInt();
    //     if(n % 10==0){
    //         continue;
    //     }
    //     System.out.println(n);

    // }while(true);
    // if(user/2==0){
    //     System.out.println("number is not prime");
    // }else{
    //     System.out.println( user +"is prime ");
    // }
    boolean isprime = true;
    for(int i = 2;i <user-1;i++){
        if(user%i == 0){
            isprime = false;
        }
    }
    if(isprime == true){
        System.out.println("NUMBER is Prime");
    }
    else{
        System.out.println("Number is prime");
    }
    
    }
}
