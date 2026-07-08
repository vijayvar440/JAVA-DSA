package arrey2cond;

public class binary_search {
    public static int binarySerch(int number[],int key){
        int start = 0;
        int end = number.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end = mid-1;
            }

            
        }
        System.out.println("envalid key !");

        return -1;
        
    }



    public static void main(String[] args) {
        int number[] =  {2,3,4,5,6,7,90};
        int key = 23;

        System.out.println(binarySerch(number, key));
        
    }
}
