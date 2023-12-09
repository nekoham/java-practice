package Lab2;

import java.util.Scanner;

public class Pro25_64010765 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines(1-15): ");
        int lineInput = input.nextInt();

        while (lineInput > 15 || lineInput < 1) {
            System.out.print("Please enter the number of lines correctly(1-15): ");
            lineInput = input.nextInt();
        }

        for (int row = 1; row <= lineInput; row++) {
            for (int i = lineInput - row; i >= 1; i--) {
                System.out.print("  ");
            }
            for (int k = row; k > 1; k--) {
                System.out.print(k + " ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        input.close();
    }
}
