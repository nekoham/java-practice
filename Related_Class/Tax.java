package Related_Class;

public class Tax {
    //Data field
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    final public static int SINGLE_FILER = 0;
    final public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    final public static int MARRIED_SEPARATELY = 2;
    final public static int HEAD_OF_HOUSEHOLD = 3;

    //Constructors
    public Tax() {
    }
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    
    //Methods
    public int getFilingStatus() {
        return filingStatus;
    }
    public int[][] getBrackets() {
        return brackets;
    }
    public double[] getRates() {
        return rates;
    }
    public double getTaxableIncome() {
        return taxableIncome;
    }
    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }
    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }
    public void setRates(double[] rates) {
        this.rates = rates;
    }
    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax;

        if (taxableIncome <= brackets[filingStatus][0]) {
            return taxableIncome * rates[0];
        }

        tax = brackets[filingStatus][0] * rates[0];

        for (int i = 1; i < brackets[filingStatus].length; i++) {
            if (taxableIncome > brackets[filingStatus][i]) {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            } 
            else {
                return tax + (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
            }
        }
        return tax + (taxableIncome - brackets[filingStatus][4]) * rates[5];
    }
}
