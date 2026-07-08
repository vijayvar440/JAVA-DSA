public class largest_string {
    public static void main(String[] args) {

        String furuts[] = {"apple","mango","banana"};
        String largest = furuts[0];
        
        for(int i =1; i < furuts.length; i++){
            if (largest.compareTo(furuts[i])<0) {
                largest = furuts[i];
            }
        }
        System.out.println(largest);
    }
};
