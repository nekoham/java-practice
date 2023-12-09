package Related_Class;

public class CheckingAccount extends Account {
    //Data field
    protected double overdraftLimit = 0;

    //Constructor
    public CheckingAccount() {
    }
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //Methods
    public void withdraw(double money) {
        super.withdrawMoney = money;
        if (balance - money >= -overdraftLimit) {
            super.withdraw(money);
        }
    }

    public String toString() {
        return "Checking Account" + "\nOverdraft Limit: " + overdraftLimit + "\nBalance is " + oldBalance + 
                "\nWithdraw: " + withdrawMoney + "\nBalance is " + balance + "\nThis account was created at " + dateCreated + "\n";
    }
}
