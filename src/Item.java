public class Item {
    private int itemCode;
    private String name;

    public Item(int itemCode, String name) {
        this.itemCode = itemCode;
        this.name = name;
    }

    public void displayItem(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + name);
    }
}
