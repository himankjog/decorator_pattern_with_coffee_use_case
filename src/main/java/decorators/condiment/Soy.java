package decorators.condiment;

import decorators.condiment.CondimentDecorator;
import models.beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + (0.30 * getSize().getCostFactor());
    }
}
