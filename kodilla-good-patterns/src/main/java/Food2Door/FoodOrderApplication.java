package Food2Door;


public class FoodOrderApplication {

    public static void main(String[] args) {

        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new FoodOrderRepository(), new FoodOrderService());
        foodOrderProcessor.process(foodOrderRequest);
    }
}
