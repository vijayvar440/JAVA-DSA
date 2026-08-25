
public class largestArrey {

    public static int largestNumber(int number[]) {
        int lagest =  Integer.MIN_VALUE;

        for(int i = 0; i<number.length;i++){
            if (lagest<number[i]) {
                lagest = number[i];
                
            }
        }
        return lagest;


    }
    public static void main(String[] args) {
        
        int arrey[] = {10,20,30,40,50};
        
        System.out.println(largestNumber(arrey));
    }
}