
public class change_arrey {
    public static void changearrey(int[] arrey, int i, int val) {
        if (i == arrey.length) {
            printarrey(arrey);
            return;
        }


    
        arrey[i] = val;
        changearrey(arrey, i + 1, val+1);
        arrey[i] =  arrey[i]-2;
    }





    public static void printarrey(int[] arrey) {

        for(int i = 0; i <arrey.length; i++){
            System.out.print(arrey[i] + " ");
        }  
        System.out.println(); 
    }



    public static void main(String[] args) {
        int arrey[] = new int[5] ;
        changearrey(arrey, 0, 1);
        printarrey(arrey);   
    }
    


    
    
    
}
