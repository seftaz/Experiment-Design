class PackageContext {
    private PackageState currentState;
    private boolean delivered;

    PackageContext() {
        this.currentState = new InTransitState();
        this.delivered = false;
    }

    void setState(PackageState state) {
        this.currentState = state;
    }

    PackageState getState() {
        return this.currentState;
    }

    void applyState() {
        this.currentState.updateState(this);
    }

    boolean isDelivered() {
        return delivered;
    }

    void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
}
