public class pair {

    public static void printBinString(int n , int lastPlce, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
       printBinString(n-1, 0, str+"0");
       if(lastPlce == 0){
        printBinString(n-1, 1, str+"1");
       }
    }
    
    public static void main(String[] args) {
            int n = 4;
        printBinString(3,0,"");

    }
}
