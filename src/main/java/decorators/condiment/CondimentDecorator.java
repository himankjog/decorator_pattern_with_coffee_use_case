package decorators.condiment;

import models.beverage.Beverage;
import models.enums.Size;

public abstract class CondimentDecorator implements Beverage {
    protected final Beverage beverage;

    CondimentDecorator(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
