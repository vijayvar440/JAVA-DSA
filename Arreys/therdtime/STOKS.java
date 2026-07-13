public class STOKS {
    public static int StockPrize(int prize[]){
        int BuyingPrize = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i = 0; i < prize.length;i++){
            if(BuyingPrize < prize[i]){
                int profit = prize[i]-BuyingPrize;

                MaxProfit = Math.max(MaxProfit,profit);

            }else{
                BuyingPrize = prize[i];
            }
        }
        return MaxProfit;
    }






    public static void main(String[] args) {
        int prize[] = {7,1,5,3,6,4};
        System.out.println(StockPrize(prize));
        
    }
}
