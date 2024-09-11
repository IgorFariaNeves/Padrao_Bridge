package padroesestruturais.bridge;

public class PremiumMaintenance implements Maintenance {

    @Override
    public float getCost() {
        return 200.0f;
    }

    @Override
    public float getCostMultiplier() {
        return 0.2f;
    }
}
