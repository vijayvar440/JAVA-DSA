public class revaersearrey {

    public static void reverArrey(int arrey []){
        int start = 0;
        int end = arrey.length-1;


        while (start<end) {
            int tamp = arrey[end];
            arrey[end] = arrey[start];
            arrey[start] = tamp;

            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int arrey[] =  {10,20,30,40,50,60,70};
        reverArrey(arrey);

        for(int i=0; i<arrey.length;i++){
            System.out.print(arrey[i] + " ");
        }
        System.out.println();
    }
}
