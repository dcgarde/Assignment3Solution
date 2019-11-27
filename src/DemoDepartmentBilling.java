public class DemoDepartmentBilling {
    public static void main(String[] args) {
        Grocery grocery1 = new Grocery(11, "Bread", 1.50, 2,0, 0);
        grocery1.displayGrocery();
        System.out.println();
        Grocery grocery2 = new Grocery(12, "Apple,", 0.75, 6, 1, 0);
        grocery2.displayGrocery();
        System.out.println();

        Clothing clothing1 = new Clothing(21, "Jeans", "Levis", 35,
                1, 0);
        clothing1.displayClothing();
        System.out.println();
        Clothing clothing2 = new Clothing(22, "Dress Shirt", "IZOD", 25,
                2, 10);
        clothing2.displayClothing();
        double totalAmount = grocery1.computeTotalPrice() + grocery2.computeTotalPrice() +
                clothing1.computeTotalPrice() + clothing2.computeTotalPrice();
        System.out.println("Total Overall Price: $" + totalAmount);
    }
}
