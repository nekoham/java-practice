package Related_Class;

import java.util.Date;

public class Account {
    //Data field
    protected int id = 0;
    protected double balance = 0;
    protected double annaulInterestRate = 0;
    protected Date dateCreated = new Date();
    protected double withdrawMoney = 0;
    protected double oldBalance;

    //Constructor
    public Account() {
    }
    public Account(int newId, double newBalance) {
        oldBalance = newBalance;
        id = newId;
        balance = newBalance;
    }

    //Methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnaulInterestRate() {
        return annaulInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAnnaulInterestRate(double newAnnaulInterestRate) {
        annaulInterestRate = newAnnaulInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annaulInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double withdrawAmount) {
        withdrawMoney = withdrawAmount;
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public String toString() {
        return "Account" + "\nBalance is " + oldBalance + "\nWithdraw: " + withdrawMoney + 
        "\nBalance is " + balance + "\nThis account was created at " + dateCreated + "\n";
    }
}
