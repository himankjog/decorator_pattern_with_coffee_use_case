package models.beverage;

import models.enums.Size;

public class Espresso extends BaseBeverage {
    public Espresso(final Size size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double getCost() {
        return 1.99 * getSize().getCostFactor();
    }
}
