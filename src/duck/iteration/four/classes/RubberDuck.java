package duck.iteration.four.classes;

import duck.iteration.four.behaviors.fly.FlyNotAtAll;
import duck.iteration.four.behaviors.quack.QuackSqueak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new QuackSqueak();
        flyBehavior = new FlyNotAtAll();
    }
}
