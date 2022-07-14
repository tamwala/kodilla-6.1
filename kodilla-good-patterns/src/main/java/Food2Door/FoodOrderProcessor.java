package Food2Door;


public class FoodOrderProcessor {

    private OrderRepository orderRepository;
    private OrderService orderService;

    public FoodOrderProcessor(final OrderRepository orderRepository, final OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public FoodOrderDto process(final FoodOrderRequest foodOrderRequest) {
        boolean isOrdered = orderService.order(foodOrderRequest.getSupplier(), foodOrderRequest.getProduct());
        if (isOrdered) {
            orderRepository.createOrder(foodOrderRequest.getSupplier(), foodOrderRequest.getProduct());
            foodOrderRequest.getSupplier().process();
            return new FoodOrderDto(foodOrderRequest.getSupplier(), true);
        } else {
            return new FoodOrderDto(foodOrderRequest.getSupplier(), false);
        }
    }
}

