package Related_Class;

import java.util.Date;

public class Transaction {
    //Data field
    protected Date date = new Date();
    protected char type;
    protected double amount;
    protected double balance;
    protected String description;

    //Constructor
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    //Methods
    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

}
