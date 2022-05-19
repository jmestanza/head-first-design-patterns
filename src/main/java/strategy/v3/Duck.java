package strategy.v3;

public abstract class Duck {
    public void swim() {
        System.out.println("I'm swimming");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public abstract void display();
}
