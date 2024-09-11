package padroesestruturais.bridge;

public abstract class Vehicle {
    protected Maintenance maintenance;
    protected float baseCost;

    public Vehicle(float baseCost) {
        this.baseCost = baseCost;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }

    public abstract float calculateMaintenanceCost();
}
