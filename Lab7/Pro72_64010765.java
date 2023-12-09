package Lab7;

import Related_Class.newAccount;

public class Pro72_64010765 {
    public static void main(String[] args) {
        newAccount account = new newAccount("George", 1122, 1000);
        account.setAnnaulInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println("Name: " + account.getName());
        System.out.println("Account ID: " + account.getId());
        System.out.println("Annual interest rate: " + account.getAnnaulInterestRate());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Date" + "\t\t\t\t\tType" + "\t\tAmount" + "\t\tBalance");
        for (int i = 0; i < account.getTransaction().size(); i++) {
            System.out.print(account.getTransaction().get(i).getDate());
            System.out.print("\t\t" + account.getTransaction().get(i).getType());
            System.out.print("\t\t" + account.getTransaction().get(i).getAmount());
            System.out.print("\t\t" + account.getTransaction().get(i).getBalance() + "\n");
        }
    }
}
