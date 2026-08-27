public class revaersearrey {
    public static void revarArrey(int arrey[]){
        int start = 0;
        int end = arrey.length-1;

        while (start<end) {
           int temp = arrey[end];

           arrey[end] = arrey[start];

           arrey[start] =  temp;

           start ++;
           end --;

        
            
        }


    }
    public static void printarrey(int arrey []){
        for(int i=0;i<arrey.length;i++){
            System.out.println(arrey[i] + " ");        }
    }

    public static void main(String[] args) {
        int arrey[] = {10,20,30,40,50,60};
        revarArrey(arrey);
        printarrey(arrey)
    }
}