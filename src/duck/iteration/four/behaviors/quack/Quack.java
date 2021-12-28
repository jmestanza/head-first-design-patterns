package duck.iteration.four.behaviors.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quacking as some bird quacks");
    }
}
