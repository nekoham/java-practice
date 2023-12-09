package Lab4;

import Related_Class.StopWatch;

public class Pro43_64010765 {
    public static void main(String[] args) {
        // Creating objects
        StopWatch stopwatch = new StopWatch();

        // Random 1000 number and print out
        System.out.println("Creating a list containing 1000 elements,");

        float[] numberList = new float[1001];
        for (int i = 1; i <= 1000; i++) {
            numberList[i] = (float) Math.random() * 1000;
            System.out.printf("%.2f ", numberList[i]);
            if (i % 5 == 0) {
                System.out.println("");
            }
        }

        System.out.println("List created.");

        // Starting stopwatch and sort number
        System.out.println("Sorting stopwatch starts...");
        stopwatch.start();
        java.util.Arrays.sort(numberList);
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%.2f ", numberList[i]);
            if (i % 5 == 0) {
                System.out.println("");
            }
        }

        // Stoping stopwatch
        stopwatch.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.", stopwatch.getElapsedTime());

        // Palindrome and prime with stopwatch starting
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        stopwatch.start();

        int count = 0;
        int num = 2;
        while (count < 1000) {
            if (palindromeCheck(num) == true && primeCheck(num) == true) {
                System.out.printf("%d ", num);
                count += 1;
                if (count % 10 == 0) {
                    System.out.println("");
                }
            }
            num += 1;
        }

        stopwatch.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.", stopwatch.getElapsedTime());
    }

    public static boolean palindromeCheck(int palindrome) {
        int original = palindrome, reverse = 0, remain;

        while (palindrome != 0) {
            remain = palindrome % 10;
            reverse = remain + (reverse * 10);
            palindrome /= 10;
        }

        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean primeCheck(int prime) {
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
