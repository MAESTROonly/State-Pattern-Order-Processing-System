public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Scenario 1: New order
        System.out.println("Scenario 1: New Order");
        order.payOrder();     // Pay order
        order.shipOrder();    // Ship order
        order.deliverOrder(); // Deliver order
        System.out.println();

        // Scenario 2: Cancelled order
        System.out.println("Scenario 2: Cancel Order");
        Order cancelledOrder = new Order();
        cancelledOrder.cancelOrder(); // Cancel order
        cancelledOrder.payOrder();    // Attempt to pay
        cancelledOrder.shipOrder();   // Attempt to ship
        cancelledOrder.deliverOrder(); // Attempt to deliver
    }
}
