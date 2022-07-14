package Food2Door;


public class FoodOrderRequest {

    private Supplier supplier;
    private Product product;

    public FoodOrderRequest(final Supplier supplier, final Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
