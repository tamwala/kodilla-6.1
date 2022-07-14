package Food2Door;


public class FoodOrderDto {

    private Supplier supplier;
    private boolean isOrdered;

    public FoodOrderDto(final Supplier supplier, final boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
