package decorator.beverages;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public Double cost() {
        return .99;
    }
}
