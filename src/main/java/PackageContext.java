public class PackageContext {
    private PackageState currentState;
    private boolean delivered;

    public PackageContext() {
        this.currentState = new InTransitState(); // Default state
        this.delivered = false;
    }

    public void setState(PackageState state) {
        this.currentState = state;
    }

    public void applyState() {
        this.currentState.updateState(this);
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
