public abstract class TaxableItem {

    private double taxRate;

    public abstract double getListPrice();

    public TaxableItem(double rate)
    {
        taxRate = rate;
    }

    public double purchasePrice()
    {
        return (1 + taxRate) * getListPrice();
    }
}
