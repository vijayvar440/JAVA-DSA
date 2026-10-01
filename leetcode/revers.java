
class revers {
    public  static  int revser(int x){
        int result = 0;

        while (x != 0) {
            int Digit = x%10;

           if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && Digit > 7)) {
                    return 0;
                }

            if (result<Integer.MIN_VALUE/10|| (result== Integer.MIN_VALUE/10 && Digit < -8)) {
                return 0;
                
            }

            result = result*10+Digit;

            x = x/10;
            
        }
        
        return  result;


    }


    public static void main(String[] args) {
        int x =  1234;
        System.out.println(revser(x));
    }
    
}