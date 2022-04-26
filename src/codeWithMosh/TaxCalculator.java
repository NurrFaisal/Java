package codeWithMosh;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return this.taxableIncome * 0.3;
    }
}
