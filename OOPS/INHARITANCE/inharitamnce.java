
public class inharitamnce {
    public static void main(String[] args) {
       Dog dobby = new Dog();
       dobby.eat();
       dobby.legs = 4;
       System.out.println(dobby.legs);
        
    }
    
}

class Animal{
    String color;
     void eat(){
        System.out.println("eats");
     }
     void bresthe(){
        System.out.println("breths");
     }
}

//  multi lavel
class Fish extends Animal{

    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

class Mammal extends  Animal{
    int legs;
}
class Dog extends Mammal{
    String breedd;
}