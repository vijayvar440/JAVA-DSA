
public class ClassAndOBJ {3
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("bullu");
        p1.setTip(5);
        System.out.println(p1.color + ", tip=" + p1.tip);
        
    }

}
class Pen{
    String color;
    int tip;
    void setColor (String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }

}

class Student{
    String name;
    int age;
    float percentage;


    void calculatePercentage(int phys, int chem, int math){
        int total = phys + chem + math;
        this.percentage = total / 3.0f;
    }

}
 


