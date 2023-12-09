package Lab6;

import java.util.Scanner;

public class Pro64_64010765 {
    public static void main(String[] args) {
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

        // Calculate and print output
        double tax = computeTax(status, income);
        System.out.println("Tax is " + tax);

        input.close();
    }

    public static double computeTax(int status, double income) {
        double tax;
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 208850, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 } };

        if (income <= brackets[status][0]) {
            return income * rates[0];
        }

        tax = brackets[status][0] * rates[0];

        for (int i = 1; i < brackets[status].length; i++) {
            if (income > brackets[status][i]) {
                tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
            } else {
                return tax + (income - brackets[status][i - 1]) * rates[i];
            }
        }
        return tax + (income - brackets[status][4]) * rates[5];
    }
}
