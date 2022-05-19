package strategy.v4.test;

import strategy.v4.classes.Duck;
import strategy.v4.classes.MallardDuck;
import strategy.v4.classes.RubberDuck;
import strategy.v4.classes.WoodenDuck;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        Duck[] ducks = new Duck[]{new MallardDuck(), new WoodenDuck(), new RubberDuck()};

        Arrays.stream(ducks).forEach(duck -> {
            System.out.println("Currently in " + duck.getClass().getSimpleName());
            duck.performQuack();
            duck.performFly();
            System.out.println();
        });


    }
}
