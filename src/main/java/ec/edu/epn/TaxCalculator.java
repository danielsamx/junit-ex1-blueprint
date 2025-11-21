package ec.edu.epn;

public class TaxCalculator {

    public double calculateTax(double amount, double tax) {
        return amount + (amount * tax/100);
    }
}
