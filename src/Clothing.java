public class Clothing extends Item implements Tax, Discount{
    private String brandName;
    private double price, units, discount;
    final double tax = 8.5;

    public Clothing(int itemc, String itemn, String brandName, double price, double units, double discount) {
        super(itemc, itemn);
        this.brandName = brandName;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    @Override
    public double computeDiscount() {
        return (discount/100) * price *units;
    }

    public double computeSubtotal(){
        double subtotal = (price * units) - computeDiscount();
        return subtotal;
    }

    @Override
    public double computeTax() {
        double taxAmt = computeSubtotal() * (tax/100);
        return taxAmt;
    }

    public double computeTotalPrice(){
        double totalPrice;
        totalPrice = computeSubtotal() + computeTax();
        return totalPrice;
    }

    public void displayClothing(){
        displayItem();
        System.out.println("Brand name: " + brandName);
        System.out.println("Unit: " + units);
        System.out.println("Price/unit: " + price);
        System.out.println("Savings: " + computeDiscount());
        System.out.println("Subtotal: " + computeSubtotal());
        System.out.println("Tax: " + computeTax());
        System.out.println("-----------------------------------------");
        System.out.println("Total Price: " + computeTotalPrice());
        System.out.println("-----------------------------------------");
    }
}
