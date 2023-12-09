package Related_Class;

import java.util.Date;

public class Employee extends Person{
    //Data fields
    protected double salary;
    protected String office;
    protected Date dateHired = new Date();

    //Constructor
    public Employee(String name) {
        this(name, 0, "none", new Date());
    }
    public Employee(String name, double salary, String office, Date dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    //Methods
    public String toString() {
        return super.toString() + " Employee{salary=" + salary + ", office=" + office + ", dateHired=" + dateHired +"}";
    }
}
