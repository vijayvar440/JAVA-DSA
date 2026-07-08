
public class stok {

    public static int bayandsellstok(int peize[]) { 
        int bayprize = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < peize.length; i++) {
            if(bayprize<peize[i]){
                int profit = peize[i]-bayprize;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{bayprize=peize[i];
                
            }
            
        }
        return maxprofit;
        

    }
    public static void main(String[] args) {
        int peize [] = {7,1,5,3,6,4};
        System.out.println( " = " +bayandsellstok(peize));
    }
}
