package strategy.v4.test;

import strategy.v4.behaviors.fly.FlyNotAtAll;
import strategy.v4.behaviors.quack.QuackSqueak;
import strategy.v4.classes.Duck;
import strategy.v4.classes.DynamicDuck;

public class miniDuckSim {
    public static void main(String[] args) {
        Duck dynamicDuck = new DynamicDuck();

        dynamicDuck.performQuack();
        dynamicDuck.performFly();

        System.out.println();

        dynamicDuck.setFlyBehavior(new FlyNotAtAll());
        dynamicDuck.setQuackBehavior(new QuackSqueak());

        dynamicDuck.performQuack();
        dynamicDuck.performFly();

    }
}
