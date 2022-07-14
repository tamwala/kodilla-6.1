package Food2Door;

public class Product {

    private String name;
    private int quantity;


    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }
}
