package decorator.condiments;

import decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    @Override
    public Double cost() {
        return 0.0;
    }
}
