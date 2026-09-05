public class maximumSubarreySum {
    public static void maximumSubarreySum(int number[]){
        int currySum =  0 ;
        int MaxSum = Integer.MIN_VALUE;

        for(int i = 0; i<number.length ; i++){
            for(int j = i ; j<number.length ; j++){
                   currySum =0;
                for(int k = i ; k <= j ; k++){
                    currySum += number[k];

                
                }
                System.out.println(currySum);

                if (MaxSum<currySum) {
                   MaxSum = currySum;
                    
                }
            }
          
        }
        System.out.println("Max sum = " + MaxSum );
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        maximumSubarreySum(number);
    }
}