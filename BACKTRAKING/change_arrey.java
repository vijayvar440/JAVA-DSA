
public class change_arrey {
    public static void changearrey(int arrey [] ,int i , int val){
        if(i == arrey.length){
            return;
        }   

        arrey[i] = val;
        changearrey(arrey, i+1, val);
        arrey[i] = arrey[i] - 2;

        
    }

    public static void rintarrey(int arrey []) {

        for(int i = 0; i <arrey.length; i++){
            System.out.print(arrey[i] + " ");
        }   
    }

    public static void main(String[] args) {
        int arrey[] = {1,2,3,4,5};
        changearrey(arrey, 0, 10);
        rintarrey(arrey);   
    }
    


    
    
    
}
