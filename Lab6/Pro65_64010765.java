package Lab6;

import java.util.Scanner;

import Related_Class.Tax;

public class Pro65_64010765 {
    public static void main(String[] args) {
        // Provide rates and brackets
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 208850, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 } };

        // Create an object
        Tax tax = new Tax();

        // Print choices
        System.out.println("Filling Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");

        // Scan input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Using tax methods
        tax.setFilingStatus(status);
        tax.setTaxableIncome(income);
        tax.setRates(rates);
        tax.setBrackets(brackets);

        // Calculate and print output
        System.out.println("Tax is " + tax.getTax());

        input.close();
    }
}
