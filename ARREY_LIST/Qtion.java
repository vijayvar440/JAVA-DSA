import java.util.ArrayList;

public class Qtion {

    public  static  boolean Monotoni(ArrayList<Integer>A){
        boolean Inc =  true;
        boolean Dec = true;
        for(int i =0;i<A.size();i++){
            if (A.get(i)<A.get(i+1)) {
                return true;
                
            }
            if (A.get(i)>A.get(i+1)) {
                return false;
                
            }
            
        }
        return Inc||Dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(Monotoni(list));
    }
}
