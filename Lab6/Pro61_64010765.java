package Lab6;

import java.util.Scanner;

import Related_Class.BMI;

public class Pro61_64010765 {
    public static void main(String[] args) {
        // Receive input
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Weight: ");
        double weight = input.nextDouble();

        System.out.print("Feet: ");
        double feet = input.nextDouble();

        System.out.print("Inches: ");
        double inches = input.nextDouble();

        // Create an object
        BMI bmiCheck = new BMI(name, age, weight, feet, inches);

        // Print output
        System.out.println("BMI is " + bmiCheck.getBMI() + " and the status is " + bmiCheck.getStatus());

        input.close();
    }
}
