package strategy.v4.classes;

import strategy.v4.behaviors.fly.FlyBehavior;
import strategy.v4.behaviors.quack.QuackBehavior;
import lombok.Setter;

@Setter
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
