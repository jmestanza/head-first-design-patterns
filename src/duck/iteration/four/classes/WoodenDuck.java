package duck.iteration.four.classes;

import duck.iteration.four.behaviors.fly.FlyNotAtAll;
import duck.iteration.four.behaviors.quack.QuackNotAtAll;

public class WoodenDuck extends Duck{
    public WoodenDuck(){
        quackBehavior = new QuackNotAtAll();
        flyBehavior = new FlyNotAtAll();
    }
}
