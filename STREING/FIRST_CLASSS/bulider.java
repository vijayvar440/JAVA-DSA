
public class bulider{
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            str.append(ch);

            ///ABCDEFGHIJKLMNOPQRSTUVWXYZ
            ///Time complexcty = 0(26)
        }
        System.out.println( str.length() );
        System.out.println(str);
        
    }

} 