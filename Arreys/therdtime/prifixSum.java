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
            int start = i;
            for(int j = i; j<number.length;j++){
                int end = j;
                currensum = start == 0?preFix[end]:preFix[end] - preFix[start-1];
                
          
               if(mxSum<currensum){
                mxSum = currensum;
               }
            
            }
           
        }
        System.out.println("max sum =" + mxSum);
    }



    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        TotalSumofarrey(number);
    }
}
