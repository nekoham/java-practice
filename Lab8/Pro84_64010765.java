package Lab8;

import Related_Class.Octagon;

public class Pro84_64010765 {
    public static void main(String[] args) {
        // Creating/Cloning objects
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = (Octagon) octagon1.clone();

        System.out.println("Octagon1's Area: " + octagon1.getArea());
        System.out.println("Octagon1's Perimeter: " + octagon1.getPerimeter());
        System.out.println("Compare rules: 0=Equal, 1=More, -1=Less");
        System.out.println("Compare Octagon1's Area to 2's Area': " + octagon1.compareTo(octagon2));

    }
}
