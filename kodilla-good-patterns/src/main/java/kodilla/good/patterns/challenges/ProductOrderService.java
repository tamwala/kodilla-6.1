package kodilla.good.patterns.challenges;


public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Product product) {
        System.out.println("Order for user " + user + "has been created");

        return true;
    }
}
