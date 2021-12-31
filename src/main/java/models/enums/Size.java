package models.enums;

public enum Size {
    TALL(1.2),
    GRANDE(1.3),
    VENTI(1.5);

    private final double costFactor;

    Size(double costFactor) {
        this.costFactor = costFactor;
    }

    public double getCostFactor() {
        return costFactor;
    }
}
