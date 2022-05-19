package strategy.v1;

public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Overriding display for RedHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
