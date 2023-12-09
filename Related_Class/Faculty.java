package Related_Class;

public class Faculty extends Employee{
    //Data fields
    protected double officeHours;
    protected String rank;

    //Constructors
    public Faculty(String name) {
        this(name, 0, "Employee");
    }
    public Faculty(String name, double officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //Methods
    public double getOfficeHours() {
        return officeHours;
    }
    public String getRank() {
        return rank;
    }
    public String toString() {
        return super.toString() + " Faculty{officeHours=" + officeHours + ", rank=" + rank +"}";
    }
}
