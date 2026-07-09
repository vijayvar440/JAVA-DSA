public class prifixSum {
    public static void TotalSumofarrey(int number []){
        int currensum= 0;
        int mxSum = Integer.MIN_VALUE;
        int preFix[] = new int[number.length];

        
        preFix[0] = number[0];
        //calculate prefix arrey

        for(int i =1; i<preFix.length; i++){
            preFix[i] = preFix[i-1]+number[i];
        }



        for(int i = 0; i<number.length;i++){
            for(int j = i; j<number.length;j++){
                currensum =  i ==0?preFix[j]:preFix[j] - preFix[i-1];
                
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
