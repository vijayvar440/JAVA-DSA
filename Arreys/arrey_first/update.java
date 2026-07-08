 //passing arrays as argument

public class update {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 10;

        }

    }

    public static void main(String[] args) {

        int marks[] = {10, 20, 30, 30, 40, 40};
        update(marks);
          for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
          }


    }

}
