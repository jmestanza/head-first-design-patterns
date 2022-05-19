package strategy.v0;

public abstract class Duck {
    public void quack() {
        System.out.println("I'm quacking");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public abstract void display();
}
