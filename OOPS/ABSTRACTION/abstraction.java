

public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();

        chikal ch = new chikal();
        ch.eat();
        ch.walk();

        Student s3 = new Student();
        s3.schoolName = "abc";
        System.out.println(s3.name);
        
    }
    
}
// abstract class Animal{
//     String color;

//     Animal(){
//         color = "brrown";
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     void changeColor(){
//         color ="red";
//     }


//     void walk(){
//         System.out.println("hors on 4 legs");
//     }
// }

class chikal extends Animal{
     void changeColor(){
        color ="yerlo";
    }



    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

///staic keyword
/// 
class Student {
    String name;
    int roll;

    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return  this.name;
    }
}