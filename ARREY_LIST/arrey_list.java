 import  java.util.ArrayList;
public class arrey_list {
    public static void main(String[] args) {

        ArrayList<Integer> list =  new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

    //   // get element
    //     int element = list.get(2);
    //     System.out.println(element);

        // delet eliomet 


        //  int delet = list.remove(2);
        //  System.out.println(list);

         list.set(2, 10);
         System.out.println(list);    
         
         
         System.out.println(list.contains(1));
    }
}
