package decorator.condiments;

import decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.20;
    }
}
