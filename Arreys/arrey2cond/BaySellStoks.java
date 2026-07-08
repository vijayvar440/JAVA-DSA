public class BaySellStoks {

    public static int stockPrize(int prizces[]) {
        int buyPrize = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prizces.length; i++) {
            if (buyPrize < prizces[i]) {
                int proFit = prizces[i] - buyPrize;
                maxProfit = Math.max(maxProfit, proFit);
            } else {
                buyPrize = prizces[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prizes[] = {7, 1, 5, 3, 6, 4};

        int result = stockPrize(prizes);
        System.out.println("Max Profit = " + result);
    }
}