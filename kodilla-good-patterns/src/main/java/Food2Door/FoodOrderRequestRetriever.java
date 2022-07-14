package Food2Door;

public class FoodOrderRequestRetriever {

    public FoodOrderRequest retrieve() {

        ExtraFoodShop supplier = new ExtraFoodShop();
        //HealthyShop supplier = new HealthyShop();
        //GlutenFreeShop supplier = new GlutenFreeShop();

        Product product = new Product("apple", 1);

        return new FoodOrderRequest(supplier, product);
    }
}
