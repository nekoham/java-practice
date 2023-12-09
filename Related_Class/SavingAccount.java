package Related_Class;

public class SavingAccount extends Account {
    //Constructor
    public SavingAccount() {
    }
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    //Methods
    public void withdraw(double money) {
        super.withdrawMoney = money;
        if (balance - money >= 0) {
            super.withdraw(money);
        }
    }

    public String toString() {
        return "Saving Account" + "\nBalance is " + oldBalance + "\nWithdraw: " + withdrawMoney + 
        "\nBalance is " + balance + "\nThis account was created at " + dateCreated + "\n";
    }
}
