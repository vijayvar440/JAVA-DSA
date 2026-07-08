public class pairs {
    public static int pairOffrend(int n){
        if(n==1|| n==2){
            return n;
        }
       return pairOffrend(n-1) + (n-1)*pairOffrend(n-2);

    }
    public static void main(String[] args) {
         int n = 3;
        System.out.println(pairOffrend(n));
       
    }
}
