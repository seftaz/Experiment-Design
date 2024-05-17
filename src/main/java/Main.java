import java.util.Scanner;

public class Main {

    private static ShippingStrategy shippingStrategy;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double weight = getPackageWeight();
        PackageContext packageContext = new PackageContext();

        while (!packageContext.isDelivered()) {
            int method = getShippingMethod();
            setShippingStrategy(method);

            double cost = calculateShippingCost(weight);
            System.out.println("Current cost: " + cost);

            int state = getPackageState();
            updatePackageState(packageContext, state);

            packageContext.applyState();
        }

        scanner.close();
    }

    private static double getPackageWeight() {
        // TODO: Implement this method
        return 0;
    }

    private static int getShippingMethod() {
        // TODO: Implement this method
        return 0;
    }

    private static void setShippingStrategy(int method) {
        // TODO: Implement this method
    }

    private static double calculateShippingCost(double weight) {
        // TODO: Implement this method
        return 0;
    }

    private static int getPackageState() {
        // TODO: Implement this method
        return 0;
    }

    private static void updatePackageState(PackageContext packageContext, int state) {
        // TODO: Implement this method
    }
}
