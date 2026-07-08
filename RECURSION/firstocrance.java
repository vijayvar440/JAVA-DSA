// public class firstocrance {
//     public static int FisrstocrNCE(int aar[], int key , int index){
//         if(index == aar.length){
//             return -1;
//         }

//         if(aar[index] == key){
//             return index;
//         }
//         return FisrstocrNCE(aar, key, index + 1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9};
//         System.out.println(FisrstocrNCE(arr, 0, 5));
//     }
    
// }


public class firstocrance {
    public static int FisrstocrNCE(int aar[], int key , int index){
        if(index==aar.length){
            return-1;
        }

        
     if(aar[index]==key){
        return index;
       }
       return FisrstocrNCE(aar,key,index+1);
    } 

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(FisrstocrNCE(arr, 5, 0));
    }
}
