public class NewState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order paid.");
        order.setState(new PaidState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped until it is paid.");
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
