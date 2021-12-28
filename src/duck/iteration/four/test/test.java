package duck.iteration.four.test;

import duck.iteration.four.classes.Duck;
import duck.iteration.four.classes.MallardDuck;
import duck.iteration.four.classes.RubberDuck;
import duck.iteration.four.classes.WoodenDuck;

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
