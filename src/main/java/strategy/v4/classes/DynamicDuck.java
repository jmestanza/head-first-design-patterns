package strategy.v4.classes;

import strategy.v4.behaviors.fly.FlyNotAtAll;
import strategy.v4.behaviors.quack.QuackNotAtAll;

public class DynamicDuck extends Duck{
    public DynamicDuck(){
        flyBehavior = new FlyNotAtAll();
        quackBehavior = new QuackNotAtAll();
    }
}
