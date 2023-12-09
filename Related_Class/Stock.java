package Related_Class;

public class Stock {
    //Data field
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    //Constructor
    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    //Method
    public double getChangePercent() {
        double percentageChanged = 100*(currentPrice-previousClosingPrice)/previousClosingPrice;
        return percentageChanged;
    }
}
