package Lab10_1;

import java.util.Scanner;
import Related_Class.GeometricObject;
import Related_Class.IllegalTriangleException;

public class Pro102_64010765 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input 
        System.out.print("Enter 1st side: ");
        double side0 = input.nextDouble();
        System.out.print("Enter 2nd side: ");
        double side1 = input.nextDouble();
        System.out.print("Enter 3rd side: ");
        double side2 = input.nextDouble();

        //Show output
        try {
            Triangle triangle1 = new Triangle(side0, side1, side2, "Black", true) ;
            System.out.println(triangle1.toString());
        }
        catch (IllegalTriangleException e) {
            e.printStackTrace();
        }

        input.close();
    }

    public static class Triangle extends GeometricObject {
        //Data fields
        private double[] sides = new double[3];

        //Constructor
        public Triangle() {
        }
            public Triangle(double side0, double side1, double side2, String color, boolean filled) throws IllegalTriangleException{
                sides[0] = side0;
                sides[1] = side1;
                sides[2] = side2;
                super.color = color;
                super.filled = filled;
                if (!isTriangle()) {
                    throw new IllegalTriangleException(sides[0], sides[1], sides[2]);
                }
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
            return "\nTriangle" + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + super.toString();
        }
    }

}
