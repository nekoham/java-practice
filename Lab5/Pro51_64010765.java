package Lab5;

import Related_Class.Account;

public class Pro51_64010765 {
    public static void main(String[] args) {
        // Create new account with specified data
        Account account = new Account(1122, 20000);
        account.setAnnaulInterestRate(4.5);

        // Using methods
        account.withdraw(2500);
        account.deposit(3000);

        // Print outputs
        System.out.println("The balance is $" + account.getBalance());
        System.out.println("The monthly interest is " + account.getMonthlyInterest());
        System.out.println("The account created date is " + account.getDate());
    }
}
