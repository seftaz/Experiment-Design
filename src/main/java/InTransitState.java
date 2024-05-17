public class InTransitState implements PackageState {
    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("Package is in transit.");
    }
}
