package models.beverage;

import models.enums.Size;

public abstract class BaseBeverage implements Beverage {
    private Size size;

    protected BaseBeverage(Size size) {
        this.size = size;
    }

    public void setSize(final Size size) {
        this.size = size;
    }

    @Override
    public Size getSize() {
        return size;
    }
}
