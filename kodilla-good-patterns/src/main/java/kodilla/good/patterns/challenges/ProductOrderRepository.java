package kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, Product product) {
        return true;
    }
}
