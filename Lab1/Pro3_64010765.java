package Lab1;

import java.util.Scanner;

public class Pro3_64010765 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 0;

        for (int i = 0; i < 3; i++) {
            result += number % 10;
            number /= 10;
        }

        System.out.print("The sum of the digits is " + result);
        input.close();
    }
}
