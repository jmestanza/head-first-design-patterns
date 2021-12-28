package duck.iteration.four.classes;

import duck.iteration.four.behaviors.fly.FlyWithWings;
import duck.iteration.four.behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
