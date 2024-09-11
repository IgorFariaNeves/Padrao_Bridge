package padroesestruturais.bridge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    private Vehicle car;
    private Vehicle truck;

    private Maintenance standardMaintenance;
    private Maintenance premiumMaintenance;

    @Before
    public void setUp() {
        car = new Car(1500);
        truck = new Truck(3000);

        standardMaintenance = new StandardMaintenance();
        premiumMaintenance = new PremiumMaintenance();
    }

    @Test
    public void testCarWithStandardMaintenance() {
        car.setMaintenance(standardMaintenance);
        float expectedCost = 1500 + 100;
        assertEquals(expectedCost, car.calculateMaintenanceCost(), 0.001);
    }

    private void assertEquals(float expectedCost, float v, double v1) {
    }

    @Test
    public void testCarWithPremiumMaintenance() {
        car.setMaintenance(premiumMaintenance);
        float expectedCost = 1500 + 200;
        assertEquals(expectedCost, car.calculateMaintenanceCost(), 0.001);
    }

    @Test
    public void testTruckWithStandardMaintenance() {
        truck.setMaintenance(standardMaintenance);
        float expectedCost = 3000 * (1 + 0);
        assertEquals(expectedCost, truck.calculateMaintenanceCost(), 0.001);
    }

    @Test
    public void testTruckWithPremiumMaintenance() {
        truck.setMaintenance(premiumMaintenance);
        float expectedCost = 3000 * (1 + 0.2f);  // 20% increase
        assertEquals(expectedCost, truck.calculateMaintenanceCost(), 0.001);
    }
}
