package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.Espresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;

import java.util.HashMap;

import static decorator.beverages.Beverage.Size.*;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        HashMap<Beverage.Size, Double> sizePrice = new HashMap<>();
        sizePrice.put(TALL, 0.10);
        sizePrice.put(GRANDE, 0.15);
        sizePrice.put(VENTI, 0.20);

        Beverage beverage = new Espresso();
        beverage.setSize(TALL);
        System.out.println(beverage.getDescription() + " $" + (beverage.cost() + sizePrice.get(beverage.getSize())));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + (beverage2.cost() + sizePrice.get(beverage2.getSize())));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + (beverage3.cost() + sizePrice.get(beverage3.getSize())));

    }
}
