// package corejava.STREING.Qtion;

// import java.util.*;

// public class Qtion1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter  your String i found !");
//         String str = sc.nextLine();
//         int count = 0;

//         for(int i=0; i<str.length();i++){
//             char ch = Character.toLowerCase(str.charAt(i));
//             if (ch == 'a'|| ch=='e'||ch=='i'||ch=='o' || ch == 'u') {
//                 count++;
                
//             }
//         }
//         System.out.print(count);


//     }
// }



import java.util.*;

public class Qtion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");
        String str = sc.nextLine();   // ✅ full line lega

        int count = 0;

        for(int i = 0; i < str.length(); i++){   // ✅ int use karo
            char ch = Character.toLowerCase(str.charAt(i)); // optional (for uppercase)

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels count = " + count);
    }
}
