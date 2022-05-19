package decorator.condiments;

import decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.15;
    }
}
