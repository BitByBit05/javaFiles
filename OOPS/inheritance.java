public class inheritance {
    public static void main(String[] args) {
        Mamals Lion = new Mamals();
        Lion.eats();
    }
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
class Mamals extends Animal {
    void roars() {
        System.out.println("Give birth to babies");
    }
    void carni() {
        System.out.println("Breastfeed");
    }
}