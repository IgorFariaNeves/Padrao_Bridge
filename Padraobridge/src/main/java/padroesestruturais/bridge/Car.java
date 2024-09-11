package padroesestruturais.bridge;

public class Car extends Vehicle {

    public Car(float baseCost) {
        super(baseCost);
    }

    @Override
    public float calculateMaintenanceCost() {
        return this.baseCost + this.maintenance.getCost();
    }
}
