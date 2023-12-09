package Related_Class;

import java.util.ArrayList;
import java.util.Date;

public class newAccount {
    //Data field
    protected int id = 0;
    protected double balance = 0;
    protected double annaulInterestRate = 0;
    protected Date dateCreated = new Date();
    protected double withdrawMoney = 0;
    protected double oldBalance;
    protected String name;
    protected ArrayList<Transaction> transactions = new ArrayList<>();

    //Constructor
    public newAccount() {
    }
    public newAccount(int newId, double newBalance) {
        oldBalance = newBalance;
        id = newId;
        balance = newBalance;
    }
    public newAccount(String newName, int newId, double newBalance) {
        oldBalance = newBalance;
        id = newId;
        balance = newBalance;
        name = newName;
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

    public void setName(String newName) {
        name = newName;
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

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransaction() {
        return transactions;
    }

    public void withdraw(double withdrawAmount) {
        withdrawMoney = withdrawAmount;
        balance -= withdrawAmount;
        transactions.add(new Transaction('W', withdrawAmount, balance, "withdraw"));
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        transactions.add(new Transaction('D', depositAmount, balance, "deposit"));
    }

    public String toString() {
        return "Account" + "\nBalance is " + oldBalance + "\nWithdraw: " + withdrawMoney + 
        "\nBalance is " + balance + "\nThis account was created at " + dateCreated + "\n";
    }
}
