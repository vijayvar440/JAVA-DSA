package arrey2cond;

public class PreeixArrey {
    public static void MaxSubArreySum(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int preFix[] = new int[number.length];

        
        preFix[0] =  number[0];
        for(int i =1; i<preFix.length; i++){
            preFix[i] = preFix[i-1]+number[i];
        }

        for(int i = 0; i <number.length; i++){
            for(int j = i;j < number.length; j++){
                currSum = i==0 ? preFix[j] : preFix[j] - preFix[j]-preFix[i];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            
            }
        }
        System.out.println("Max Sum = " + maxSum);

    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        MaxSubArreySum(number);

        
    }
    
}
