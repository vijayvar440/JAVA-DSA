package Fuction_second_time;

class chek_if_prime {

    

public static boolean chekIsprime(int n){
    if(n <= 1){
        return false;
    }

    if(n == 2){
        return true;
    }

    for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0){
            return false;   // ✔️ divide hua → prime nahi
        }
    }

    return true; 
    System.out.println(i); 
}

public static void main(String[] args) {
System.out.println(chekIsprime(10));


};
}
