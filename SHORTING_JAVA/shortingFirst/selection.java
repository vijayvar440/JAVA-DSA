
// import java.util.concurrent.ThreadPoolExecutor;
// public class selection {
//     public static void selectionshort(int arrey[]) {
//         for (int i = 0; i < arrey.length - 1; i++) {
//             int minPosion = i;
//             for (int j = i + 1; j < arrey.length; j++) {
//                 if (arrey[minPosion] > arrey[j]) {
//                     minPosion = j;
//                 }
//             }
//             int tamp = arrey[minPosion];
//             arrey[minPosion] = arrey[i];
//             arrey[i] = tamp;
//         }
//     }
//     public static void arrey(int arrey[]) {
//         for (int i = 0; i < arrey.length; i++) {
//             System.out.print(" "+ arrey[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int arrey[] = {5,4,3,7,2,9,8,0,8,3,7};
//         selectionshort(arrey);
//         arrey(arrey);
//     }
// }
public class selection {

    public static void selectionshort(int arrey[]) {
        for (int i = 0; i < arrey.length - 1; i++) {
            int minPosion = i;
            for (int j = 1 + i; j < arrey.length; j++) {
                if (arrey[minPosion] < arrey[j]) {
                    minPosion = j;
                }
            }
            int tamp = arrey[minPosion];
            arrey[minPosion] = arrey[i];
            arrey[i] = tamp;
        }
    }

    public static void arrey(int arrey[]) {
        for (int i = 0; i < arrey.length; i++) {
            System.out.print(" " + arrey[i]);
        }
    }

    public static void main(String[] args) {
        int arrey[] = {5, 4, 3, 7, 2, 9, 8, 0, 8, 3, 7};
        selectionshort(arrey);
        arrey(arrey);
    }
}