package Related_Class;

public class Square extends GeometricObject implements Colorable {
    //Data field
    protected double side;

    //Constructor
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }

    //Methods
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String howToColor() {
        return "Color all four sides.";
    }

    @Override
    public String toString() {
        return "\nSquare" + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
