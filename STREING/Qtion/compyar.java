public class compyar {
    public static void CopyarLargestStr(String Furut[]){
        String largest = Furut[0];

        for(int i =0; i<Furut.length;i++){
            if (largest.compareTo(Furut[i]) < 0 ) {
                largest = Furut[i];
                
            }
        }

        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruts[] ={"apple","mango","orange"};
        CopyarLargestStr(fruts);
    }


}
