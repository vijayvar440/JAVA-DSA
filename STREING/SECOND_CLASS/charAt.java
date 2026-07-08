public class charAt {
    public static void printlelatter(String str) {
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
            
        }
        System.out.println();
    
        
    }



    public static void main(String[] args) {
        String full_name = "vijay var";
        printlelatter(full_name);
    }
}
