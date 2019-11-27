public class Grocery extends Item implements Tax, Discount{
    public double price, units, discount, tax;

    public Grocery(int itemc, String itemn, double price, double units, double discount, double tax) {
        super(itemc, itemn);
        this.price = price;
        this.units = units;
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double computeDiscount() {
      return (discount/100) * price * units;
    }

    @Override
    public double computeTax() {
        return 0;
    }

    public double computeSubtotal(){
        double subtotal = (price * units) - computeDiscount();
        return subtotal;
    }

    public double computeTotalPrice(){
        double totalPrice;
        totalPrice = computeSubtotal() + computeTax();
        return totalPrice;
    }

    public void displayGrocery(){
        displayItem();
        System.out.println("Unit: " + units);
        System.out.println("Price/unit: " + price);
        System.out.println("Savings: " + computeDiscount());
        System.out.println("Subtotal: " + computeSubtotal());
        System.out.println("Tax: " + computeTax());
        System.out.println("-----------------------------------------");
        System.out.println("Total Price: " + computeTotalPrice());
        System.out.println("----------------------------------------");
    }
}
