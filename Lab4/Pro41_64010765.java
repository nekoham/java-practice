package Lab4;

import Related_Class.Stock;

public class Pro41_64010765 {
    public static void main(String[] args) {
        // Creating object
        Stock myStock = new Stock("ORCL", "Oracle Corporation");
        myStock.previousClosingPrice = 34.5;
        myStock.currentPrice = 34.35;

        // Using methods from stock class
        double priceChanged = myStock.getChangePercent();

        // Output
        System.out.printf("Symbol: %s\n", myStock.symbol);
        System.out.printf("Name: %s\n", myStock.name);
        System.out.printf("Previous Closing Price: %.1f\n", myStock.previousClosingPrice);
        System.out.printf("Current Price: %.2f\n", myStock.currentPrice);
        System.out.printf("Price Change: %.15f%%\n", priceChanged);
    }
}
