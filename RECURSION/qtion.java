public class qtion {
    public static int countocrane(int arr[], int key , int index){
        int idx[] = {};
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==key){
           System.out.print(index+ " ");
        //      index;
         }
        return countocrane(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        countocrane(arr, 2, 0);
    }
}
