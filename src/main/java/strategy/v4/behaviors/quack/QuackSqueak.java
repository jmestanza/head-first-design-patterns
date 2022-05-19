package strategy.v4.behaviors.quack;

public class QuackSqueak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeaking!!! ");
    }
}
