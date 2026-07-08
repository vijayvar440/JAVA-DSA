// //tapping Ranwater

// public class auxxlury {
//     public static int tappingwhater(int hight[]) {
//         int n = hight.length;

//         int leftmax[] = new int[n];
//         leftmax[0] = hight[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(hight[i], leftmax[i - 1]);
//         }

//         int rightmax [] = new int [n];
//         rightmax[n-1] = hight[n-1];
//         for (int i = n-2; i >= 0; i--) {
//             rightmax[i ] = Math.max(hight[i], rightmax[i+1]);
//         }

//         int trappedWater = 0;
//         for (int i = 0; i < n; i++) {
//             int whaterlavel = Math.min(rightmax[i], leftmax[i]);
//             trappedWater += whaterlavel-hight[i];
//         }

//         return trappedWater;
//     }
//     public static void main(String[] args) {
//         int  hight[] = {4,2,0,6,3,2,5};
//         System.out.println(tappingwhater(hight));
//     }
// }
public class auxxlury {

    public static int trappinmg(int hight[]) {
        int n = hight.length;
        int leftmax[] =  new int[n];
        leftmax[0] = hight[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i],hight[i-1]);
        }
        int rightmax[] = new int[n];

        rightmax[n-1] = hight[n-1];
        for (int i = n-2; i >=0; i--) {
            rightmax[i] = Math.max(rightmax[i],hight[i+1]) ;           
        }
       int  trappwhater = 0;
       for (int i = 0; i < n; i++) {
        trappwhater += Math.min(leftmax[i], rightmax[i]);
           
       }

      return trappwhater;

    }

    public static void main(String[] args) {
        int hight[] = {4,2,0,3,2,5};
        System.out.println(trappinmg(hight));

    }
}
