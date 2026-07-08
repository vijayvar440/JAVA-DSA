
// public class insertion {

//     public static void insertionshort(int arrey[]) {
//         for (int i = 1; i < arrey.length; i++) {
//             int curr = arrey[i];
//             int prev = i - 1;
//             while (prev >= 0 && arrey[prev] <arrey[curr]) {
//                 arrey[prev + 1] = arrey[prev];
//                 prev--;
//             }
//             arrey[prev + 1] = arrey[prev];
//         }

//     }

//     public static void printarrey(int arrey []) {
//         for (int i = 0; i < arrey.length; i++) {
//             System.out.println(arrey[i] + " ");
//         }

//     }

//     public static void main(String[] args) {
//         int arrey[] = {5, 4, 3, 7, 8, 6, 4, 3,};

//         insertionshort(arrey);
//         printarrey(arrey);

//     }
// }
public class insertion {

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int previous = i - 1;
            while (previous >= 0 && array[previous] > current) {
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous + 1] = current;
        }
    }

    public static void printArray(int array []) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = {5, 4, 3, 7, 8, 6, 4, 3};

        System.out.println("Before sorting:");
        printArray(array);

        insertionSort(array);

        System.out.println("After sorting:");
        printArray(array);
    }
}