public class qtions {
    public static int Findindes(int arrey []){
        int target = 30;
        int index = 0;

        for(int i = 0; i <arrey.length; i++){
            if (target == arrey[i]) {
                
                index  = arrey[i];
                
            }
           

        }
         return index;
    }
    public static void main(String[] args) {
        int number [] = {10,20,30,40,50};
        System.out.println(Findindes(number));
    }
}
