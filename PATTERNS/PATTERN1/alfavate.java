public class alfavate {

    public static void main(String[] args) {
        char ch = 'A';
        for(int line = 1; line <= 4 ; line ++){
            for(int chare = 1 ; chare <= line; chare++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}