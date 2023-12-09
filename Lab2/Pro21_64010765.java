package Lab2;

import java.util.Scanner;

public class Pro21_64010765 {
    public static void main(String[] args) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner dayInput = new Scanner(System.in);

        System.out.print("Enter today's day(0-6): ");
        int currentDay = dayInput.nextInt();

        while (currentDay > 6 || currentDay < 0) {
            System.out.print("Please enter today's day correctly(0-6): ");
            currentDay = dayInput.nextInt();
        }

        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = dayInput.nextInt();

        System.out.printf("Today is %s and the future day is %s", days[currentDay], days[(currentDay + futureDay) % 7]);

        dayInput.close();
    }
}
