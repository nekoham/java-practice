package Related_Class;

public class Staff extends Employee{
    //Data field
    protected String title;

    //Constructor
    public Staff(String name) {
        this(name, "none");
    }
    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    //Method
    public String getTitle() {
        return title;
    }
    public String toString() {
        return super.toString() + " Faculty{title=" + title +"}";
    }
}
