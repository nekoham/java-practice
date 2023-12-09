package Lab10_1;

import java.util.Scanner;

public class Pro101_64010765 {
    public static void main(String[] args) {
        //Create 100 integers as array
        int[] numbers = new int[100];

        //Giving 100 integers a value
        for(int i = 0; i < 100; i++) {
            numbers[i] = (int)(Math.random() * 500);
        }

        //Ask user to give the array's index
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = input.nextInt();

        //Show the value/Use exception
        try {
            System.out.println("The value is " + numbers[index]);
        }
        catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("Out of Bounds.");
        }

        input.close();
    }
}
