
public class carAt {
    public static void prinatr(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" " + i);
        }
    }
    public static void main(String[] args) {
        String fullname = "vijay";
        prinatr(fullname);
        
    }
}
