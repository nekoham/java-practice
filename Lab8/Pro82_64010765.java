package Lab8;

import Related_Class.Triangle;
import Related_Class.Square;
import Related_Class.GeometricObject;
import Related_Class.Colorable;

public class Pro82_64010765 {
    public static void main(String[] args) {
        // Creating all object
        GeometricObject[] geometric = new GeometricObject[5];
        geometric[0] = new Square(5);
        geometric[1] = new Square(4);
        geometric[2] = new Triangle(3, 4, 5, "asd", true);
        geometric[3] = new Triangle(10, 11, 12, "dddd", false);
        geometric[4] = new Square(6);

        // Output
        for (int i = 0; i < geometric.length; i++) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println(geometric[i].getClass().getSimpleName());
            System.out.println("Area: " + geometric[i].getArea());
            if (geometric[i] instanceof Colorable) {
                System.out.println("How to color: " + ((Colorable) geometric[i]).howToColor());
            }
            System.out.println("-------------------------------------------------------------------");
        }

    }
}
