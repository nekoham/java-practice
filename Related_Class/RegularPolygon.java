package Related_Class;

public class RegularPolygon {
    //Data field
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //Constructors
    public RegularPolygon() {
    }
    public RegularPolygon(int newSideNumber, double newSideLength) {
        n = newSideNumber;
        side = newSideLength;
    }
    public RegularPolygon(int newSideNumber, double newSideLength, double newX, double newY) {
        n = newSideNumber;
        side = newSideLength;
        x = newX;
        y = newY;
    }

    //Accessor and mutator methods
    public int getSideNumber() {
        return n;
    }
    public double getSideLength() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setSideNumber(int newSideNumber) {
        n = newSideNumber;
    }
    public void setSideLength(double newSideLength) {
        side = newSideLength;
    } 
    public void setX(double newX) {
        x = newX;
    }
    public void setY(double newY) {
        y = newY;
    }

    //Calculating methods
    public double getPerimeter() {
        return n * side;
    }
    
    public double getArea() {
        return (n*side*side)/(4*Math.tan((Math.PI/n)));
    }

}
