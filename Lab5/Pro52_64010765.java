package Lab5;

import Related_Class.RegularPolygon;

public class Pro52_64010765 {
    public static void main(String[] args) {
        // Creating objects
        RegularPolygon firstPolygon = new RegularPolygon();
        RegularPolygon secondPolygon = new RegularPolygon(6, 4);
        RegularPolygon thirdPolygon = new RegularPolygon(10, 4, 5.6, 7.8);
        RegularPolygon test = new RegularPolygon();

        System.out.println(test.getX());

        // Display perimeter and area
        System.out.println("First polygon's perimeter is " + firstPolygon.getPerimeter() + " and its area is "
                + firstPolygon.getArea());
        System.out.println("Second polygon's perimeter is " + secondPolygon.getPerimeter() + " and its area is "
                + secondPolygon.getArea());
        System.out.println("Thrid polygon's perimeter is " + thirdPolygon.getPerimeter() + " and its area is "
                + thirdPolygon.getArea());
    }
}
