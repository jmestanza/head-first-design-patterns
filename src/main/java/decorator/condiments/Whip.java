package decorator.condiments;

import decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.10;
    }
}
