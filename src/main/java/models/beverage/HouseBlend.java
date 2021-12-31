package models.beverage;

import models.enums.Size;

public class HouseBlend extends BaseBeverage {
    public HouseBlend(final Size size) {
        super(size);
    }

    @Override
    public String getDescription() {
        return "HouseBlendCoffee";
    }

    @Override
    public Double getCost() {
        return 1.19 * getSize().getCostFactor();
    }
}
