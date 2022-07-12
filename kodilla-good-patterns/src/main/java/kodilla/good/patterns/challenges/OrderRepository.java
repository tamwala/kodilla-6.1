package kodilla.good.patterns.challenges;


public interface OrderRepository {

    public boolean createOrder(User user, Product product);
}
