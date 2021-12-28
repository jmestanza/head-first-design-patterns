package duck.iteration.four.classes;

import duck.iteration.four.behaviors.fly.FlyBehavior;
import duck.iteration.four.behaviors.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
