package kodilla.good.patterns.challenges;

public class Product {

    private String name;
    private int id;
    private int quantity;

    public Product(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
