package arrey2cond;

public class reves_in_arrey {
    public static void revers(int number[]){
        int first = 0, last = number.length-1;
        while (first<last) {
            int teamp  =  number[last];
            number[last] = number[first];
            number[first] = teamp;
            first++;
            last--;
            
        }
       


    }
    public static void main(String[] args) {
        int arr[] =  {10,3,4,5,6,78,7};
        revers(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print((arr[i]+ " "));

        }
        System.out.println();
    }
}
