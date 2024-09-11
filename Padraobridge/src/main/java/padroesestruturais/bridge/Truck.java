package padroesestruturais.bridge;

public class Truck extends Vehicle {

    public Truck(float baseCost) {
        super(baseCost);
    }

    @Override
    public float calculateMaintenanceCost() {
        return this.baseCost * (1 + this.maintenance.getCostMultiplier());
    }
}
