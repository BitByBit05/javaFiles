public class inheritence {
    
}

//Base Class
class Animal {
    String color;
    void eats() {
        System.out.println("Eats");
    }
    void breathes() {
        System.out.println("Breathes");
    }
    void walks() {
        System.out.println("Walks");
    }
}
//Derived Class
class Lion extends Animal {
    void roars() {
        System.out.println("roars");
    }
    void carni() {
        System.out.println("Carnivorous");
    }
}