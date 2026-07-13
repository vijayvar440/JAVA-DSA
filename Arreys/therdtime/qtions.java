public class qtions {
    public static int Findtreget(int arrey[], int target ){
        int left =  0;
        int right = arrey.length-1;

        while (left<=right) {
            int mid = (left+right)/2;

            if (arrey[mid]==target) {
                return mid;

                
            }else if (arrey[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
            
        }
        return -1;
    }




    
    public static void main(String[] args) {
        int atregt = 30;
        int number [] = {10,20,30,40,50};
       System.out.println(Findtreget(number,atregt));
    }

}