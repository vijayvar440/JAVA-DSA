public class printSubstr {
    public static void SubArrey(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j = i; j <number.length;j++){
                for(int k = i ; k <= j ; k++ ){
                    System.out.print("("+number[k] +")" +  "  ");
                }
                System.out.println();
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int number[] = {2,3,4,5,67,7,8,9};
        SubArrey(number);
    }
}