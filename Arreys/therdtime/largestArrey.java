import java.util.*;
public class largestArrey {
    public static int lagestArrey(int arrey[]){
        int largest = Integer.MIN_VALUE;
   


        for(int i = 0; i <arrey.length; i++){
            if (largest<arrey[i]) {
                largest =  arrey[i];
            
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int arr[] =  {10,30,40,50,06,70} ;
        System.out.print(lagestArrey(arr));
    }
}
