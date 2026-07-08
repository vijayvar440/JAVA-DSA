public class Access_modifire {
    public static void main(String[] args) {

        BnakAcount myAcc =  new BnakAcount();
        myAcc.UsreNmae = "vijayvar";
        myAcc.setPssswerd("abcdfghi");

        
    }
}

class BnakAcount {
    public String UsreNmae;
    private String  Password ; 
    public void setPssswerd (String Pws){
        Password = Pws;
    }
}