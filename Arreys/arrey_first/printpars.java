
public class printpars {

    public static void printpars(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int carr = number[i];
            for (int j = 1 + i; j < number.length; j++) {
                System.out.print("(" + carr + "," + number[j] + " )");
                
              tp++;
            }
          
            System.out.println();

        }
          System.out.println("total paqr is " + tp);
        

    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printpars(number);
    }
}
