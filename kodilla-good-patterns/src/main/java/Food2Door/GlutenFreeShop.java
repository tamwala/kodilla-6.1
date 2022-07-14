package Food2Door;

public class GlutenFreeShop implements Supplier{

    private String name;
    private int vatNumber;

    public void process() {
        System.out.println("Order from Gluten Free Shop created");
    }

    public String getName() {
        return name;
    }

    public int getVatNumber() {
        return vatNumber;
    }
}
