public class firstqtion {
    public static int opcrenceofnum(int arr[],int key , int index){
        if(arr[index].length){
            return -1;
        }

        if(arr[index]==key){
            return index;
        }
        return opcrenceofnum(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        System.out.println(opcrenceofnum(arr, 2, 0));
    }
}
