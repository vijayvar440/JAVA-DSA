package arrey2cond;

public class laregest {
    public static int getLargest(int number[]){
        int laregest = Integer.MIN_VALUE;
        int mainuma = Integer.MAX_VALUE;

        for(int i =1; i< number.length;i++){
            if(laregest<number[i]){
                laregest = number[i];
            }
            if(mainuma>number[i]){
                mainuma = number[i];
            }
        }
        System.out.println("smolest valu is  = "+ mainuma);
        return laregest;
    }



    public static void main(String[] args) {
        int number [] = {3,5,3,6,7,8,10};

        int lar = getLargest(number);
        System.out.println("largets valu viss = "+lar);

        
    }
}
