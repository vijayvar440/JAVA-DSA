package arrey2cond;

public class pairs {
    public static void pairs(int number[]){
        int tp = 0;
        for(int i = 0;i < number.length;i++){
            int curry = number[i];  
            for(int j = i+1; j < number.length;j++){
                System.out.print("(" + curry + ","+number[j] + ")");
                tp++;

            }
            System.out.println();

        }
        System.out.println("Total pairs = "+ tp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10} ;
        pairs(number);
        
    }
}
