public class qtionth {
    public static int profit(int price[] ){
        int Byprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i<price.length;i++){
            if (Byprice<price[i]) {
                int profit = price[i]- Byprice;

                maxProfit = Math.max(maxProfit, profit);
                
            }else{
                Byprice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int number[]  = {7,1,5,3,6,4};
        System.out.println(profit(number));
    }
}
