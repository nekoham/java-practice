package Lab3;

public class Pro31_64010765 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 100) {
            if (palindromeCheck(num) == true && primeCheck(num) == true) {
                System.out.printf("%d ", num);
                count += 1;
                if (count % 10 == 0) {
                    System.out.println("");
                }
            }
            num += 1;
        }
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
