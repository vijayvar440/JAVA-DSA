public class super_keywor {
    public static void main(String[] args) {
        Horse h = new Horse();
        
        
    }
}

class Animal{
    Animal(){
        System.out.println("contructor is colled");
    }
}


class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse contructor ic colled");
    }
}