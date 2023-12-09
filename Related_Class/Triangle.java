package Related_Class;

public class Triangle extends GeometricObject {
    //Data fields
    private double[] sides = new double[3];

    //Constructor
    public Triangle() {
    }
    public Triangle(double side0, double side1, double side2, String color, boolean filled) {
        sides[0] = side0;
        sides[1] = side1;
        sides[2] = side2;
        super.color = color;
        super.filled = filled;
    }

    //Methods
    public boolean isTriangle() {
        if (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[2]) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public double getArea() {
        double s = (sides[0] + sides[1] + sides[2]) / 2.0;
        return Math.pow(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]), 0.5); 
    }
    @Override
    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
    @Override
    public String toString() {
        if (isTriangle()) {
            return "\nTriangle" + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + super.toString();
        }
        else {
            return "Error: Not a real triangle.";
        }
    }
}
