// public class bubble {
//     public static void bubble(int number[]) {
//         for (int i = 0; i < number.length-1; i++) {
//             for (int j = 0; j < number.length - 1 - i; j++) {

//                 if (number[j] > number[j + 1]) {
//                     int tmap = number[j];
//                     number[j] = number[j + 1];
//                     number[j + 1] = tmap;
//                 }
//             }
//         }
//     }
//     public static void printArray(int[] number) {
//         for (int i = 0; i < number.length; i++) {
//             System.out.print(" " + number[i]);
//         }
//         // System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] number = {5, 3, 8, 4, 2};
//         // printArray(number);
//         bubble(number);
//         printArray(number); // Print the sorted array
//     }
// }
// public class bubble {

//     public static void bubuelshort(int number[]) {

//         for (int i = 0; i < number.length - 1; i++) {
//             for (int j = 0; j < number.length - 1 - i; j++) {
//                 if (number[j] > number[j + 1]) {

//                     int tamp = number[j];
//                     number[j] = number[j + 1];
//                     number[j + 1] = tamp;
//                 }

//             }

//         }

//     }

//     public static void arrey(int number[]) {
//         for (int i = 0; i < number.length; i++) {
            
        

        
//             System.out.print(" " + number[i]);

//         }

//     }

//     public static void main(String[] args) {
//         int number[] = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//         bubuelshort(number);
//         arrey(number);
//     }
// }




// public class bubble{
//     public static void bubbelshort(int arrey[]) {
//         for (int i = 0; i < arrey.length-1; i++) {
//             for (int j = 0; j < arrey.length-1-i; j++) {
//                 if(arrey[j]>arrey[j+1]){
//                     int tamp = arrey[j];
//                     arrey[j] = arrey[j+1];
//                     arrey[j+1] = tamp;

//                 }
                
//             }
            
//         }
        
        
        
//     }
//     public static void  arrey(int arrey[]) {
//         for (int i = 0; i < arrey.length; i++) {
//             System.out.print(" "+ arrey[i]);
            
//         }
//     }
//     public static void main(String[] args) {
//         int arrey[] = {9,8,7,6,5,4,3,2,1} ;
//         bubbelshort(arrey);
//         arrey(arrey);
//     }
// }
public class bubble{
    public static void bubuelshort(int arrey []) {
        for (int i = 0; i < arrey.length-1; i++) {
            for (int j = 0; j < arrey.length-1-i; j++) {
                if(arrey[j]>arrey[j+1]){
                    int tamp = arrey[j];
                    arrey[j] = arrey[j+1];
                    arrey[j+1]= tamp;
                }
                
            }
            
        }
        
    }
    public static void arrey(int arrey[]) {
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(" " +arrey[i]);
            
        }
        
    }
    public static void main(String[] args) {
       int  arrey [] = {6,8,9,0,6,5,4,4,3};
       bubuelshort(arrey);
       arrey(arrey);
    }
}