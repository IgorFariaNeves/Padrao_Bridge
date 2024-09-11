package padroesestruturais.bridge;

public class StandardMaintenance implements Maintenance {

    @Override
    public float getCost() {
        return 100.0f;
    }

    @Override
    public float getCostMultiplier() {
        return 0.0f;
    }
}
