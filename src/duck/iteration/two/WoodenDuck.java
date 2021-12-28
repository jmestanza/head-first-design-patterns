package duck.iteration.two;

public class WoodenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Overriding display for MallardDuck");
    }

    @Override
    public void fly() {
        // override to do nothing
    }
}
