package Fuction_second_time;

import java.util.Scanner;

public class find_fact {

    public static int fctorial(int n ){
        int f = 1;
        for(int i = 1; i <= n ; i ++){
            f = f * i;

        }
        return(f);

    }





    public static int  binomilacooo(int n, int r){
        int fctorial_n = fctorial(n);
        int factorial_r = fctorial(r);
        int factorial_n_r = fctorial(n-r);

        int Bino_Coff = fctorial_n/(factorial_r*factorial_n_r);
        return Bino_Coff;

        

    }


    public static void main(String[] args) {
        System.out.println("BINOMIAL_FACTORIAL IA = "+binomilacooo(5, 2));
    
       
       
      
    }
}
 