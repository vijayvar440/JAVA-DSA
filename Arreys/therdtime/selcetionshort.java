public class selcetionshort {
    public static void selctionshort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int miniposion = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[miniposion] > arr[j]) {
                    miniposion =j;
                    
                }
            }
            int tamp = arr[miniposion];
            arr[miniposion]=arr[i];
            arr[i] = tamp;
        }
    }
    public static void printarrey(int arrey[]) {
        for(int i =0; i <arrey.length;i++){
            System.out.print(arrey[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int arrey[] = {4,2,3,4,5,6,7} ;
        selctionshort(arrey);
        printarrey(arrey);
    }
}
