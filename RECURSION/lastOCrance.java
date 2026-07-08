public class lastOCrance {
    public static int lastOCrance(int arr[], int key , int index){
        if(index==arr.length){
            return -1;
        }

        int lastOCP = lastOCrance(arr, key, index+1);

        if(lastOCP == -1 &&  arr[index]==key){
            return index;
        }
        return lastOCP;


    }

   
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,3,};
        System.out.println(lastOCrance(arr, 3, 0));
        
    }
}
