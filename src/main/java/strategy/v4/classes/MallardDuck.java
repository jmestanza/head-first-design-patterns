package strategy.v4.classes;

import strategy.v4.behaviors.fly.FlyWithWings;
import strategy.v4.behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
