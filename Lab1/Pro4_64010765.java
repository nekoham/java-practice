package Lab1;

import java.util.Scanner;

public class Pro4_64010765 {
    public static void main(String[] args) {
        Scanner weightInput = new Scanner(System.in);
        Scanner heightInput = new Scanner(System.in);
        double bmi;
        double POUND_TO_KG = 0.45359237;
        double INCH_TO_METE = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = weightInput.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = heightInput.nextDouble();

        bmi = (weight * POUND_TO_KG) / (((height * INCH_TO_METE)) * ((height * INCH_TO_METE)));
        System.out.print("BMI is " + bmi);

        weightInput.close();
        heightInput.close();
    }
}
