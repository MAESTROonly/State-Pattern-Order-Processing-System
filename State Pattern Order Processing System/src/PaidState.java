public class PaidState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered until it is shipped.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledState());
    }
}
