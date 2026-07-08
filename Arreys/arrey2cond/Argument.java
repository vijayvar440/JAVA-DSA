package arrey2cond;

public class Argument {
    public static void update (int marks  []){
        for(int i =0; i <  marks.length;i++ ){
            marks[i] =  marks[i]+1;
        }

    }
     
    public static void main(String[] args) {
        int Mraks[] = {98,99,100};
        update(Mraks);

        for (int i = 0; i < Mraks.length; i++) {
            System.out.println(Mraks[i] + " ");
        }
        

        
    }
}
