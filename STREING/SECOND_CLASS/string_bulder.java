public class string_bulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char chr = 'a';chr <= 'z'; chr++){
                     sb.append(chr);
        }
      
        System.out.println(sb + " ");
    }
}

