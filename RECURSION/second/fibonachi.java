public class fibonachi {

    public static int fibonachi(int n){
        if (n == 0 || n== 1) { 
            return n;
            
        }

       int Fn1 = fibonachi(n-1);
       int fb2 =  fibonachi(n-2);


      int fidn = Fn1+fb2;

      return fidn;

    }



    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibonachi(n));
    }
}
