public class firstOcrence {
    public static int FirstOcrence(int arr[],int key , int idx){
        if (idx == arr.length) {
            return -1;
            
        }

        if(arr[idx] == key){
            return idx;
        }
        return FirstOcrence(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arrey[] = {1,2,3,4,5,6,7,8};
        System.out.println(FirstOcrence(arrey, 6, 0));
    }
}
