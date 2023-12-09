package Related_Class;

public class Student extends Person{
    //Data fields
    final public static String FRESHMAN = "Freshman";
    final public static String SOPHOMORE = "Sophomore";
    final public static String JUNIOR = "Junior";
    final public static String SENIOR = "Senior";
    protected String status;

    //Constructor
    public Student(String name) {
        super(name);
    }
    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    //Methods
    public String toString() {
        return super.toString() + " Student{status=" + status + "}";
    }
}
