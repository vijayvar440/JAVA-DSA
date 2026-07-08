public class qtion5 {
    public static String compress(String str){
        // String newSteing ="";
        StringBuilder sb = new StringBuilder("");
    

        //aaabc
        for(int i = 0;i<str.length();i++){
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++;

                
            }
            // newSteing += str.charAt(i);
            sb.append(str.charAt(i));
            if (count>1) {
                // newSteing += count.toString();
                sb.append(count.toString());
                
            }
           
        }
       return sb.toString();
    }
        
        
    
    public static void main(String[] args) {
        String str  = "aaabbcccdd";
        System.out.println(compress(str));
        
    }
}
