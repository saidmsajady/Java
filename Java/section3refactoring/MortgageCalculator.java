package section3refactoring;
public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.annualInterest = annualInterest;
        this.principal = principal;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double[] getRemainingBalances() {
        var balances = new double[(int) getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
	        balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private float getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
    
}
