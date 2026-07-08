package arrey2cond;

public class Liner_search {
    public static int linearSearch(int number[],int key){
        for(int i =0;i <number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }



    public static void main(String[] args) {
        int number[] = {10,15,20,25,30};
        int key = 10;

        int index = linearSearch(number, key);
        if(index== -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is Found =  " + index+ "  = " + key);
        }
        
    }
}
