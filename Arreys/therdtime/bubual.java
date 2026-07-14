public class bubual {
    public static void bubulshort(int arrey[]){

        for(int i = 0; i<arrey.length-1;i++){
            for(int j =0 ; j<arrey.length-1-i;j++){
                if (arrey[j]>arrey[j+1]) {
                    int temp = arrey[j];
                    arrey[j] = arrey[j+1];
                    arrey[j+1] = temp;
                    
                }
            }
            
        }
        
    }
    public static void printarrey(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        bubulshort(arr);
        printarrey(arr);
   
    }
}
