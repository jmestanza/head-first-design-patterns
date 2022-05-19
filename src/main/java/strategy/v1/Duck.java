package strategy.v1;

public abstract class Duck {
    public void quack() {
        System.out.println("I'm quacking");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public abstract void display();
    public abstract void fly();
}
