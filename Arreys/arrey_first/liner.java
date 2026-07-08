//linear serch 

public class liner {

    public static int linerserch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;

            } 

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50};
        int key = 20;

        int index = linerserch(number, key);
        if (index == -1) {
            System.out.println("not found");

        } else {
            System.out.println("key is a index  =  " + index);

        }
    }



    // public static String foodmanu(String manu[] , int ) {
    //     for (int i = 0; i < manu.length; i++) {
    //         if(manu[i] == key)
            
    //     }

        
    // }
}

