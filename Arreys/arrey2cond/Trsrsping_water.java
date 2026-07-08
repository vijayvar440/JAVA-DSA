public class Trsrsping_water {
    public static int Traping_water(int hight[] ){
        int n = hight.length;
        int leftMax[] = new int[n];
        leftMax[0] = hight[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(hight[i], leftMax[i-1]);
        
        }

        int rightmax [] = new int [n];
        rightmax[n-1] = hight[n-1];
        for(int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(hight[i], rightmax[i+1]);
        }

        int trappedWater =0;
        for(int i = 0; i <n; i++){
            int waterLavel = Math.min(leftMax[i], rightmax[i]);
            trappedWater += waterLavel-hight[i];
        }
        return trappedWater;
    }



    
    public static void main(String[] args) {
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println(Traping_water(hight));
    }
}    
