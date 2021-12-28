package duck.iteration.four.behaviors.quack;

public class QuackNotAtAll implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("This bird doens't quack :(");
    }
}
