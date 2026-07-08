import java.util.*;
public class qtion {

    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3}, {4, 5, 6}};
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 6)
                count++;
            }
        }
        System.out.println(count);  
    }
}
