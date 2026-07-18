public class areyShort {
  public static boolean isShorted(int arr[],int i ){
    if ( i == arr.length-1) {
        return true;
        
    }

    if (arr[i] > arr[i+1]) {
        return false;
        
    }
    return isShorted(arr, i+1);
  }
    public static void main(String[] args) {
        int arry[] = {1,2,5,3,4,6};
        System.out.println(isShorted(arry, 0));
    }
}
