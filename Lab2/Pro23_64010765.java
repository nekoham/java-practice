package Lab2;

import java.util.Scanner;

public class Pro23_64010765 {
    public static void main(String[] args) {
        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", };
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month(1-12): ");
        int month = input.nextInt();

        System.out.print("Enter a day of the month(1-31): ");
        int day = input.nextInt();

        if (month < 3) {
            month += 12;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + k + ((26 * (month + 1)) / 10) + (k / 4) + (j / 4) + (5 * j)) % 7;

        System.out.printf("The name of the day of the week is %s", days[h]);
        input.close();
    }
}