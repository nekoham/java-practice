package Lab8;

import java.util.Scanner;
import Related_Class.Triangle;

public class Pro81_64010765 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter 1st side: ");
        double side0 = input.nextDouble();
        System.out.print("Enter 2nd side: ");
        double side1 = input.nextDouble();
        System.out.print("Enter 3rd side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter Color: ");
        String color = input.next();

        System.out.print("Enter Filled Status(true/false): ");
        boolean filled = input.nextBoolean();

        // Create object
        Triangle triangle = new Triangle(side0, side1, side2, color, filled);

        // Output
        System.out.println(triangle.toString());

        input.close();
    }
}
