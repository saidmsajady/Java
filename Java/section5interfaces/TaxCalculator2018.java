package section5interfaces;

public class TaxCalculator2018 implements TaxCalculator {

    private double taxableIncome;

    public TaxCalculator2018 ( double taxableIncome ) {
        this.taxableIncome = taxableIncome;
        System.out.println("The Income is: " + taxableIncome);
    }

    public void setTaxableIncome ( double taxableIncome ) {
        this.taxableIncome = taxableIncome;
    }
    
    @Override
    public double calculateTax() {
        return taxableIncome * 0.4;
    }

}
