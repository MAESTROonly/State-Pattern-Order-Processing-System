public class ShippedState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered.");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after shipping.");
    }
}
