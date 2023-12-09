package Related_Class;

public abstract class GeometricObject {
    //Data fields
    protected String color;
    protected boolean filled;
    protected java.util.Date dateCreated;

    //Constructors
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    //Methods
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "\nColor: " + color + "\nFilled: " + filled + "\nDate Created: " + dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
