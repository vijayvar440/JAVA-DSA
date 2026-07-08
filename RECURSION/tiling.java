public class tiling {
    public static int tailingprobleam(int n){
        if(n == 0|| n==1){
            return 1;
        }




       return tailingprobleam(n-1)+tailingprobleam(n-2);

    }
    public static void main(String[] args) {
        System.out.println(tailingprobleam(4));
        
    }
}
