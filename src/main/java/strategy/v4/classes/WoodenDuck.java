package strategy.v4.classes;

import strategy.v4.behaviors.fly.FlyNotAtAll;
import strategy.v4.behaviors.quack.QuackNotAtAll;

public class WoodenDuck extends Duck{
    public WoodenDuck(){
        quackBehavior = new QuackNotAtAll();
        flyBehavior = new FlyNotAtAll();
    }
}
