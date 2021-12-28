package duck.iteration.three;

public class test {
    public static void main(String[] args){
        MallardDuck duckExample = new MallardDuck();
        duckExample.quack();
        duckExample.display();

        WoodenDuck duckExample2 = new WoodenDuck();
//        duckExample2.quack(); // <- can't use it as WoodenDuck doesn't quack
        duckExample2.display();
    }
}
