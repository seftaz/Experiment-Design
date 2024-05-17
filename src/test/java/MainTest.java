import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MainTest {
    @Test
    public void testGetPackageWeight() {
        String input = "5.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        Main main = new Main(scanner);

        assertEquals(5.0, main.getPackageWeight(), 0.0);
    }

    @Test
    public void testGetShippingMethod() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        Main main = new Main(scanner);

        assertEquals(1, main.getShippingMethod());
    }

    @Test
    public void testSetShippingStrategy() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        Main main = new Main(scanner);

        main.setShippingStrategy(1);
        assertTrue(Main.shippingStrategy instanceof StandardShipping);

        main.setShippingStrategy(2);
        assertTrue(Main.shippingStrategy instanceof ExpressShipping);
    }

    @Test
    public void testCalculateShippingCost() {
        Main.shippingStrategy = new StandardShipping();
        Main main = new Main(new Scanner(new ByteArrayInputStream("".getBytes())));
        assertEquals(12.5, main.calculateShippingCost(5.0), 0.0);
    }

    @Test
    public void testGetPackageState() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        Main main = new Main(scanner);

        assertEquals(1, main.getPackageState());
    }

    @Test
    public void testUpdatePackageState() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);
        Main main = new Main(scanner);

        PackageContext packageContext = new PackageContext();

        main.updatePackageState(packageContext, 1);
        assertTrue(packageContext.getState() instanceof InTransitState);

        main.updatePackageState(packageContext, 2);
        assertTrue(packageContext.getState() instanceof DeliveredState);
    }
}
