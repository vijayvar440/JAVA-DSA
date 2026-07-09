public class maximumSubarreySum {
    public static void TotalSumofarrey(int number []){
        int currensum= 0;
        int mxSum = Integer.MIN_VALUE;

        for(int i = 0; i<number.length;i++){
            for(int j = i; j<number.length;j++){
                currensum = 0;
                for(int k = i; k<=j ;k++){
                   currensum += number[k];
                }
                System.out.println(currensum);
               if(mxSum<currensum){
                mxSum = currensum;
               }
            
            }
           
        }
        System.out.println(mxSum);
    }



    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        TotalSumofarrey(number);
    }
}
