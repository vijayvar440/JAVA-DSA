public class qtion2 {
    static String digits[] = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };
    public static void printDigit(int n){
        if(n == 0){
            return;
        }

        int latdigt  =  n%10;
         printDigit(n/10);
         System.out.print(digits[latdigt] + " 5");
    }
    public static void main(String[] args) {
        int num = 12345;
        printDigit(num);
    }

}

