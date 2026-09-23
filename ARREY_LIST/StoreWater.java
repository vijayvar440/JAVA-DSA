import  java.util.ArrayList;

public class StoreWater {

    public  static  int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i =0; i<height.size();i++){
            for(int j =i +1 ; j<height.size(); j++){
                int ht = Math.min(height.get(i),height.get(j));
                int with = j-i;
                int Currentwater  = ht*with;

                maxWater = Math.max(maxWater, Currentwater);

            }
        }
        return  maxWater;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();

        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(storeWater(hight)   );
        
    }
}
