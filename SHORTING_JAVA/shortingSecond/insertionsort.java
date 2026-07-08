public class insertionsort {
    public static void inserton(int arry[]){
        for(int i=1; i <arry.length;i++){
            int curr = arry[i];
            int perv = i-1;

            while (perv >= 0 && arry[perv] > curr){
                arry[perv+1 ] = arry[perv];
                perv--;
            }

            arry[perv+1] = curr;
            }
        }
        public static void printArrey(int arr[]) {
            for(int j = 0; j < arr.length;j++){
                System.out.print(arr[j] + " ");
            }
             System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3,5};
        inserton(arr);  
        printArrey(arr);

    }

}