public class removeDuplicatString {
    public static void removeDuplicat(String str, int indx , StringBuilder newStr, boolean map[]){
        if(indx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kam

        char currChar = str.charAt(indx);
        if(map[currChar - 'a'] == true){
            removeDuplicat(str, indx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicat(str, indx+1, newStr.append(currChar), map);
        }
    }



    public static void main(String[] args) {
        String n = "appnnacollege";
        removeDuplicat(n, 0, new StringBuilder(""),new boolean[26]);

    }
}
