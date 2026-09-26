
import java.util.ArrayList;

public class Pairsumto {

    public static boolean tosumarrey(ArrayList<Integer> listt, int target) {

        int bp = -1;
        int n = listt.size();

        // Find breaking point
        for (int i = 0; i < n - 1; i++) {
            if (listt.get(i) > listt.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Smallest element
        int lp = bp + 1;

        // Largest element
        int rp = bp;

        while (lp != rp) {

            int sum = listt.get(lp) + listt.get(rp);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 10;

        System.out.println(tosumarrey(list, target));
    }
}
dd
