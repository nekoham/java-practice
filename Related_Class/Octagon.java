package Related_Class;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
    //Data field
    protected double side;

    //Constructor
    public Octagon() {
    }
    public Octagon(double side) {
        this.side = side;
    }

    //Methods
    @Override
    public double getArea() {
        return (2+(4/22)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        }
        else if (this.getArea() < another.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public Object clone() {
        Object o = null;
        try {o = super.clone();} 
        catch (CloneNotSupportedException ex) {}
        return o;
    }
}
