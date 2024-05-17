
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

    double getPackageWeight() {
        System.out.print("Enter the weight of the package: ");
        return scanner.nextDouble();
    }

    int getShippingMethod() {
        System.out.println("Enter shipping method (1 for Standard, 2 for Express): ");
        return scanner.nextInt();
    }

    void setShippingStrategy(int method) {
        if (method == 1 && !(shippingStrategy instanceof StandardShipping)) {
            shippingStrategy = new StandardShipping();
        } else if (method == 2 && !(shippingStrategy instanceof ExpressShipping)) {
            shippingStrategy = new ExpressShipping();
        }
    }

    double calculateShippingCost(double weight) {
        return shippingStrategy.calculateCost(weight);
    }

    int getPackageState() {
        System.out.println("Enter package state (1 for In-Transit, 2 for Delivered): ");
        return scanner.nextInt();
    }

    void updatePackageState(PackageContext packageContext, int state) {
        if (state == 1) {
            packageContext.setState(new InTransitState());
        } else if (state == 2) {
            packageContext.setState(new DeliveredState());
        }
    }
}
