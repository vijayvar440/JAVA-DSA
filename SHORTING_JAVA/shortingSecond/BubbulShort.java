// // public class BubbulShort {

// //     public static void BubbleSHort(int arr[]){
// //         for(int turn = 0 ; turn < arr.length-1; turn++){
// //             for(int j = 0 ; j <arr.length-1-turn;j++){
// //                 if(arr[j] > arr[j+1] ){

// //                     int tamp = arr[j];
// //                     arr[j] = arr[j+1];
// //                     arr[j+1] = tamp;
// //                 }
// //             }
            
// //         }
    
// //     }
// //     public static void printArrey(int arr[]) {
// //         for(int i=0; i< arr.length;i++){
// //             System.out.print(arr[i] + " ");
// //         }
// //         System.out.println();
// //     }

// //     public static int bubbleShort(int arr[]){
// //         int arrey [] = {2,4,56,7,8};
// //         BubbleSHort(arrey);
// //         printArrey(arrey);
        
// //     }
// // }



// public class BubbulShort {

//     public static void bubbleSort(int arr[]){
//         for(int turn = 0; turn < arr.length-1; turn++){
//             for(int j = 0; j < arr.length-1-turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

    

//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args){
//         int arr[] = {2,4,56,7,8};

//         bubbleSort(arr);   // sorting
//         printArray(arr);   // printing
//     }
// }

public class BubbulShort {

    public static void bubbulshort(int arr[]){
        for(int tern =0; tern<arr.length-1;tern++){
            for(int j = 0; j<arr.length-1-tern;j++){
                if (arr[j] >arr[j+1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
    }
    public static void PrintArrey(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,6,8,6,4,1};
        bubbulshort(arr);
        PrintArrey(arr);
    }
}