package Related_Class;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    //Data fields
    protected double width;
    protected double height;

    //Constructor
    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Methods
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width*2) + (height*2);
    }

    @Override
    public boolean equals(Object another) {
        return another instanceof Rectangle && this.getArea() == ((Rectangle) another).getArea();
    }

    @Override
    public int compareTo(Rectangle another) {
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
}
