package decorator.beverages;

public class Decaf extends Beverage {

    Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public Double cost() {
        return 1.05;
    }
}
