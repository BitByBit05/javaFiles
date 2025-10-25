public class constructors {
    public static void main(String[] args) {
        StudentClass cmsa23035 = new StudentClass("Kumarjit Das", "233142-21-0035", "142-21-0524-23");
        System.out.println(cmsa23035.name);
        StudentClass cmsa23051 = new StudentClass("233142-21-0035");
        StudentClass cmsa23034 = new StudentClass(cmsa23035);
        System.out.println(cmsa23034.name);
    }

    
}

class StudentClass {
    String name;
    private String roll;
    private String reg;
        
    //Parameterized
    StudentClass(String name, String roll, String reg) {
        this.name = name;
        this.roll = roll;
        this.reg = reg;
    }
    //Non-Parameterized
    StudentClass() {
        System.out.println(this.name);
    }
    //Copy Constructor 
    StudentClass(StudentClass s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
    StudentClass(String roll) {
        System.out.println(this.name);
    }
}