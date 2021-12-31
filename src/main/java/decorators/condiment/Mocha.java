package decorators.condiment;

import models.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double getCost() {
        return beverage.getCost() + (0.20 * getSize().getCostFactor());
    }
}
