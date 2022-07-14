package Food2Door;

public class HealthyShop implements Supplier{

    private String name;
    private int vatNumber;

    public void process() {
        System.out.println("Order from Healthy Shop created");
    }

    public String getName() {
        return name;
    }

    public int getVatNumber() {
        return vatNumber;
    }
}
