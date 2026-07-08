
public class palandrome {

    public static boolean Ispalandrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "vijay"; //racecar, madam, mom, level, rotor, reviver, radar, redder, madam, mom
        System.out.println(Ispalandrome(str));
    }
}
