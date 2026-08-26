public class binary {
    public static int Binarey(int number[] ,int key) {
        int st = 0;
        int et = number.length-1;
        while (st<=et) {
            int mide = (st+et)/2;
            if (number[mide] == key) {
                return mide;
            }

                if (number[mide]<key) {
                    st = mide+1;

                    
                }else{
                    et = mide-1;
                }
                
            
            
        }
        return -1;
       
    }

    public static void main(String[] args) {
        int arrey[] = {10,20,30,40,50,60};
        int key = 60;
        System.out.println(Binarey(arrey, key));

    }
}