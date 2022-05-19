package strategy.v4.classes;

import strategy.v4.behaviors.fly.FlyNotAtAll;
import strategy.v4.behaviors.quack.QuackSqueak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new QuackSqueak();
        flyBehavior = new FlyNotAtAll();
    }
}
