package Lab8;

import Related_Class.Rectangle;

public class Pro83_64010765 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10, 10);
        Rectangle rec2 = new Rectangle(5, 20);
        Rectangle rec3 = new Rectangle(5, 10);

        System.out.println("Rectangle1's Area equals Rectangle2's Area: " + rec1.equals(rec2));
        System.out.println("Compare rules: 0=Equal, 1=More, -1=Less");
        System.out.println("Rectangle1's Area compares to Rectangle3's Area: " + rec1.compareTo(rec3));
    }
}
