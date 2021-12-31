package decorators.condiment;

import models.beverage.Beverage;
import models.enums.Size;

public abstract class CondimentDecorator implements Beverage {
    protected final Beverage beverage;
    protected Size size;

    CondimentDecorator(final Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public Size getSize() {
        return size;
    }
}
