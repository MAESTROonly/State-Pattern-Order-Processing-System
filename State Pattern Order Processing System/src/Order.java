public class Order {
    private State state;

    public Order() {
        // Initial state is New
        this.state = new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void payOrder() {
        state.payOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
