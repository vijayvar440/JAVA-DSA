
public class linearSerch {
    public static int LinerSerch(int arrey[] , int key){
        for(int i = 0; i<arrey.length;i++){
            if (arrey[i] == key) {
                return i;
                
            }
        }
        return -1;


    }




    public static void main(String[] args) {
        int arr[] = {10,30,40,50,60};
       
       System.out.print( LinerSerch(arr, 40));
        

        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();


        

        
    }
}
