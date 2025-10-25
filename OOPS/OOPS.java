public class OOPS {
    public static void main(String[] args) {
        Student cmsa2332 = new Student();
        cmsa2332.setName("Kumarjit Das");
        cmsa2332.setRoll(35);
        cmsa2332.setSemester(4);
        cmsa2332.setCourse("B.Sc CS 4 YEAR MAJOR");
        cmsa2332.setPwd("kumu1234");
        System.out.println(cmsa2332.name);
        System.out.println(cmsa2332.getPWD());
        System.out.println(cmsa2332.sem);
        System.out.println(cmsa2332.course);
        System.out.println(cmsa2332.getRoll());
    }
}

class Student {
    public String name;
    private String pwd;
    private int roll;
    public int sem;
    public String course;

    String getPWD() {
        return this.pwd;
    }
    int getRoll() {
        return this.roll;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    void setRoll(int roll) {
        this.roll = roll;
    }
    void setSemester(int sem) {
        this.sem = sem;
    }
    void setCourse(String course) {
        this.course = course;
    }
}