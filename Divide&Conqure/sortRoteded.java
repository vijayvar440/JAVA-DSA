public class sortRoteded {
    // public static void printArrey(int arr[]){
    //     for(int i = 0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();

    // }

    
    public static int serch(int arr[],int tgr,int si, int ei){

        int mid = (si+ei)/2;

        // case found
        if (arr[mid]==tgr) {
            return mid;
            
        }
        //mid in line 1
        if (arr[si]<=arr[mid]) {
            //case a : left
            if (arr[si]<=tgr && tgr<=arr[mid]) {
                return serch(arr, tgr, si, mid-1);
            }
            else{
                //ccse b : right
                return serch(arr, tgr,mid+1, ei);
            }
            
        }
        // mid line 2
        else{
            //case c :right
            if (arr[mid]<=tgr && tgr<=arr[ei]) {
                return serch(arr, tgr, mid+1, ei);
                
            }else{
                //case d
                return serch(arr, tgr, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,0,1,2};
        int tgr = 0;
        int tarIdxz = serch(arr, tgr, 0, arr.length-1);
        System.out.println(tarIdxz);
    }
    
     
}
