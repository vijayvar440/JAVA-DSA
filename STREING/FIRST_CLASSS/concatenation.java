
public class concatenation {
    public static void serchfullname(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            
        }
        System.out.println();

        
    }

    public static void main(String[] args) {

        String firstname = "vijay";
        String lastname = " var";
        String fullname = firstname + " " + lastname;
        // System.out.println(fullname);
        // System.out.println(fullname.charAt(4));


        serchfullname(fullname);

    }
}
