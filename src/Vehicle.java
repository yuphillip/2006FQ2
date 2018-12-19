public class Vehicle extends TaxableItem {

    private double dealerCost;
    private double dealerMarkup;
    private double taxRate;

    public Vehicle(double cost, double markup, double rate)
    {
        super(rate);
        dealerCost = cost;
        dealerMarkup = markup;
        taxRate = rate;
    }

    public void changeMarkup(double newMarkup)
    {
        dealerMarkup = newMarkup;
    }

    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }

    public String toString()
    {
        double num = getListPrice()*(taxRate + 1);
        double listPrice = Math.round(num*100)/100D;
        String output = "";
        output = "Dealer Cost: " +  dealerCost + "\nDealer Markup: " + dealerMarkup + "\nTax Rate: " + taxRate + "\nPurchase Price: " + listPrice;
        return output;
    }
}
