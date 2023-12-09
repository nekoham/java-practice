package Lab7;

import Related_Class.Account;
import Related_Class.SavingAccount;
import Related_Class.CheckingAccount;

public class Pro71_64010765 {
    public static void main(String[] args) {
        Account account = new Account(1, 5000);
        account.withdraw(5000);
        System.out.println(account.toString());

        CheckingAccount checkingAccount = new CheckingAccount(2, 5000, 5000);
        checkingAccount.withdraw(10000);
        System.out.println(checkingAccount.toString());

        SavingAccount savingsAccount = new SavingAccount(3, 5000);
        savingsAccount.withdraw(5000);
        System.out.println(savingsAccount.toString());
    }
}