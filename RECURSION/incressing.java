
class incressing {
    public static void increeing(int n) {
        if (n == 1) {
            System.out.print(n + "   ");
            return;
        }
        increeing(n-1);
        System.out.print(n+ " ");
        
    }

    public static void main(String[] args) {
        int n = 10;
        increeing(n);

    }

}