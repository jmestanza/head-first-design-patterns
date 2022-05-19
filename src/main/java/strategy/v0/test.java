package strategy.v0;

public class test {
    public static void main(String[] args){
        MallardDuck duckExample = new MallardDuck();
        duckExample.quack();
        duckExample.display();

        RedHeadDuck duckExample2 = new RedHeadDuck();
        duckExample2.swim();
        duckExample2.display();
    }
}
