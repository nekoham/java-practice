package Lab6;

import java.util.Scanner;

import Related_Class.Account;

public class Pro66_64010765 {
    public static void main(String[] args) {

        // Creating objects
        Account[] newAccount = new Account[10];
        for (int i = 0; i < 10; i++) {
            newAccount[i] = new Account(i, 100);
        }

        // Creating scanner
        Scanner input = new Scanner(System.in);

        // Start program
        int id;
        int choice;
        int amount;
        boolean state = true;
        while (true) {
            // Ask id
            System.out.println("");
            System.out.print("Enter an id: ");
            id = input.nextInt();
            while (id < 0 || id > 9) {
                System.out.print("Incorrect id. Enter a correct id: ");
                id = input.nextInt();
            }
            state = true;

            while (state) {
                // Main menu
                System.out.println("");
                printMenu();
                choice = input.nextInt();
                while (choice < 0 || choice > 4) {
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();
                }

                if (choice == 1) {
                    System.out.print("The balance is " + newAccount[id].getBalance());
                    System.out.println("");
                } else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    amount = input.nextInt();
                    while (amount > newAccount[id].getBalance()) {
                        System.out.print("You don't have enough money. Enter a correct amount to withdraw: ");
                        amount = input.nextInt();
                    }

                    newAccount[id].withdraw(amount);
                } else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    amount = input.nextInt();
                    newAccount[id].deposit(amount);
                } else if (choice == 4) {
                    System.out.println("End of Program");
                    state = false;
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
    }
}
