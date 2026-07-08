public class Quicck {
    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quckShort(int arr[],int si, int ei){
        if (si>=ei) {
            return ;
        }

        int pidx = partition(arr, si, ei);
        quckShort(arr, si, pidx-1); // left part
        quckShort(arr, pidx+1, ei); // right part

    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;

    }
    



    public static void main(String[] args) {
        
      int  arr[] = {6,3,9,8,2,5};
       quckShort(arr, 0, arr.length-1);
       printArr(arr);
    }
}
