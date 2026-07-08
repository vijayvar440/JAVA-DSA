
class lenthStr {
    public static int findStr(String str){
        if(str.length() == 0){
            return 0;
        }
        return findStr(str.substring(1))+1;

    }public static void main(String[] args) {
        String name = "vijay";
        System.out.println(findStr(name));
    
    }


}