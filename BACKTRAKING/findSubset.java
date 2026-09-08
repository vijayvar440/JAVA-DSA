public class findSubset {

    public  static  void findsunSet(String str,String ans,int i){

        if (i == str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
                
            }
            else{
                 System.out.println(ans);

            }
           

            return ;
            
        }


        //yes choice

        findsunSet(str, ans+str.charAt(i), i+1);

        // no choice

        findsunSet(str, ans, i+1);





    }

    public static void main(String[] args) {

        String str = "abc";

        findsunSet(str,"", 0);
    



    }
    
    
}
