public class DeliveredState implements PackageState {
    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("Package has been delivered.");
        ctx.setDelivered(true);
    }
}