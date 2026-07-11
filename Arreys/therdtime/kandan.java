public class kandan {
    public static void kandanSalgo(int number[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int i = 0; i<number.length;i++){
            curr = curr+number[i];
            if(curr<0){
                curr= 0;
            }
            max = Math.max(max,curr);

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
          kandanSalgo(number);
    
    }
}
