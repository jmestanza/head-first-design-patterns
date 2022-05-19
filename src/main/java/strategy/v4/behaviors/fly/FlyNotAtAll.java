package strategy.v4.behaviors.fly;

public class FlyNotAtAll implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This bird can't fly");
    }
}
