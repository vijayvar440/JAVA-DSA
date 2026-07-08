public class binary {
    public static int binarySerch(int arry[] ,int key){
        int left = 0;
        int right = arry.length-1;

        while (left<=right) {
            int mid = (left+right)/2;

            if (arry[mid]==key) {
                return mid;
                
            }
            else if (arry[mid] < key) {

                left = mid+1;
                
            }
            else{
                right = mid-1;
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arry[] = {10,20,30,40,50,60,70};
         int key   = 60;
        System.out.print(binarySerch(arry, key));
    }
    
}
