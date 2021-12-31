package models.beverage;

import models.enums.Size;

public class Latte extends BaseBeverage {
    public Latte(final Size size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public Double getCost() {
        return 0.79 * getSize().getCostFactor();
    }
}
