public class Haybread {
    public static void main(String[] args) {

        // mamael boddy = new mamael();
        // boddy.type();
        // boddy.leg = 4
        // 
        
        
        deer d = new deer();
        d.eat();
        
    }
    
}

class Animal {
    String color;
    void eat(){
        System.out.println("EAT");
    }
    void Berath(){
        System.out.println("all  is bereths");
    }
}

class Fish extends Animal{
    void type(){
        System.out.println("Tuna");
        System.out.println("Shark");
    }

}

class Brid extends Animal{
    void type(){
        System.out.println("picok");
        System.out.println("GHUGHU");
    }
}
class mamael  extends Animal{
    int leg;
    void type(){
        System.out.println("Dog");
        System.out.println("CAT");
    }

    
}

// this is overrriding
class deer extends Animal {
    void eat(){
        System.out.println("EAT GRREAS");
    }
}
