package duck.iteration.three;

public class MallardDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Overriding display for MallardDuck");
    }

    @Override
    public void quack() {
        // for every Duck we would have to override this function, making it difficult to maintain
        System.out.println("I'm quacking as a MallardDuck");
    }
}
