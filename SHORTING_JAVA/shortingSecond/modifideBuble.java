
public class modifideBuble {
    public static boolean modifideBubleShort(int arr[]){
        boolean is_swipe = false;
        for(int i = 0; i<arr.length; i++ ){
            for(int j = 0; j<arr.length-1-i; j++){
                if (arr[j] <= arr[i+1]) {

                    //swipe
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    is_swipe = true;
                    
                }
            }
            if (is_swipe == false) {
                break;
                
            }
        }

    }
    public static void main(String[] args) {
        int ARR[] = {1,4,5,6,7,8};
        
        System.out.print(modifideBubleShort(ARR));
    
    }
}
