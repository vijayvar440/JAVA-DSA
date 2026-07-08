//getIthbit - setithbit - clearithbit
public class get{
    public static int getIthbit(int n, int i) {
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
            
        }
        else{
            return 1;
        }
    }
    public static int setbit(int n,int i) {
        int bitmask = 1<<i;
        return  n|bitmask;
        
    }
    public static int  clearbit(int n , int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
        
    }

    // update set bit 
    public static int updatesetbit(int n, int i,int neswbit) {
        if(neswbit == 0){
            return clearbit(n, i);
        }
        else{
            return setbit(n, i);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(getIthbit(0, 1));
    }
}