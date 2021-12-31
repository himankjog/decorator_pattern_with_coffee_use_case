package decorators.condiment;

import decorators.condiment.CondimentDecorator;
import models.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + (0.50 * getSize().getCostFactor());
    }
}
