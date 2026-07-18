public class lastOcrenc {
    public static int lastOcrenc(int arrey[],int key ,int idx){
        if (idx == arrey.length) {
            return -1;
            
        }
        int isShorted =  lastOcrenc(arrey, key, idx+1);
        if (isShorted != -1) {
            return isShorted;
            
        }

        if (arrey[idx] == key) {
              return  idx;
            
        }
        return -1;
      
        
    }
    public static void main(String[] args) {
        int arrey[] = {1,2,3,4,5,6,7,8,5};
        System.out.println(lastOcrenc(arrey, 5, 0));

    }
}
