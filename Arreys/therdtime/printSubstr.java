public class printSubstr {
       
   
    public static void printSubstr(int number[]){
        int ts = 0;
        for(int i = 0; i <number.length; i++){
            int start = number[i];
            for(int j = 0; j<number.length; j++){
                int end = number[j];

                for(int k=start; k<end ; k++){
                    System.out.print("[" + number[k] + " " + "]");
                } 
                ts++;
                 System.out.println();
            }
            System.out.println();
        }
        System.out.println("totalSubArrey " + ts);
          
    }
    public static void main(String[] args) {
        int number[] =  {1,3,4,5,6,7,8,9};
        printSubstr(number);
    }
}
