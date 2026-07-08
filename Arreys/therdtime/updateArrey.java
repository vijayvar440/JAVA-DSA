public class updateArrey {
    public  static void upadte_arry(int arr[]){
        for(int i = 0; i < arr.length;i++){
            arr[i] = arr[1]+1;
        }
        
        
    }
   



    public static void main(String[] args) {
        int arr[] = {10,20,30,40};

        upadte_arry(arr);


        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
    }
    
    
}
