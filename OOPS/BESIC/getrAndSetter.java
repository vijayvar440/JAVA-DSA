// public class getrAndSetter {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("Bllu");
//         System.out.println(p1.getColor());

//         p1.setTip(5);
//         System.out.println(p1.getTip());
//         p1.setColor("yellow");
//         System.out.println(p1.getColor());
        

//     }
    
// }
// class Pen {
//     String color;
//     int tip;

//     String setColor(){

//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }



//     void setColor(String newColor){
//         this.color =  newColor;
//     }

//     void setTip(int tip){
//         this.tip =tip;
//     }
// }



public class getrAndSetter {
    public static void main(String[] args) {

        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {

    String color;
    int tip;

    // Getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    

    // Setter
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}