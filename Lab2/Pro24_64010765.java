package Lab2;

import java.util.Scanner;

public class Pro24_64010765 {
    public static void main(String[] args) {
        Scanner cityInput = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = cityInput.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = cityInput.nextLine();

        System.out.print("Enter the thrid city: ");
        String thridCity = cityInput.nextLine();

        String tempCity;
        if (thridCity.compareTo(firstCity) < 0 && firstCity.compareTo(secondCity) < 0) {
            tempCity = firstCity;
            firstCity = thridCity;
            thridCity = tempCity;
        } else if (secondCity.compareTo(firstCity) < 0 && secondCity.compareTo(thridCity) < 0) {
            tempCity = firstCity;
            firstCity = secondCity;
            secondCity = tempCity;
        }
        if (secondCity.compareTo(thridCity) > 0) {
            tempCity = thridCity;
            thridCity = secondCity;
            secondCity = tempCity;
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s", firstCity, secondCity, thridCity);

        cityInput.close();
    }
}
