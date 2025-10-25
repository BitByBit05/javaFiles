public class sample {
    public static void main(String[] args) {
        Animal dog = new Animal(); //Method overloading
        dog.pwd = "1234";
    }
}

class Animal {
    /*Argument */
    String username;
    String pwd;

    // Method Overloading
    Animal () {

    }
    Animal (String pwd, String name) {
        username = name;
        this.pwd = pwd;
    }
    Animal (String name) {
        username = name;
    }
    
}