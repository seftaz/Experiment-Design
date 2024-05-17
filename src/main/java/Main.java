import java.util.Scanner;

public class Main {
    static ShippingStrategy shippingStrategy;
    private Scanner scanner;

    Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main(scanner);
        main.run();
        scanner.close();
    }

    private void run() {
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
    }

    static double getPackageWeight() {
        // TODO: Implement this method
        return 0;
    }

    static int getShippingMethod() {
        // TODO: Implement this method
        return 0;
    }

    static void setShippingStrategy(int method) {
        // TODO: Implement this method
    }

    static double calculateShippingCost(double weight) {
        // TODO: Implement this method
        return 0;
    }

    static int getPackageState() {
        // TODO: Implement this method
        return 0;
    }

    static void updatePackageState(PackageContext packageContext, int state) {
        // TODO: Implement this method
    }
}

