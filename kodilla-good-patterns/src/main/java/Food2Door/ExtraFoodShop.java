package Food2Door;

public class ExtraFoodShop implements Supplier{

    private String name;
    private int vatNumber;

    public void process() {
        System.out.println("Order from Extra Food Shop created");
    }

    public String getName() {
        return name;
    }

    public int getVatNumber() {
        return vatNumber;
    }
}
