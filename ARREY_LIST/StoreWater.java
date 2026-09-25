import  java.util.ArrayList;

public class StoreWater {

    // public  static  int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i =0; i<height.size();i++){
    //         for(int j =i +1 ; j<height.size(); j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int with = j-i;
    //             int Currentwater  = ht*with;

    //             maxWater = Math.max(maxWater, Currentwater);

    //         }
    //     }
    //     return  maxWater;
    // }

    public  static  int storeWater(ArrayList<Integer> height){
        int maxWAter = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp<rp) {
            //calculater water area 

            int ht = Math.min(height.get(lp),height.get(rp));
            int with  =  rp-lp;
            int Currentwater = ht*with;
            maxWAter = Math.max(maxWAter, Currentwater) ;


            // update ptr 

            if (height.get(lp)<height.get(rp)) {
                lp++;
                
            }else{
                rp--;
            }
            
        }
        return  maxWAter;
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
        System.out.println(storeWater(hight));
        
    }
}
