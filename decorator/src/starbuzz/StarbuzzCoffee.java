package starbuzz;

import starbuzz.coffee.DarkRoast;
import starbuzz.coffee.Espresso;
import starbuzz.coffee.HouseBlend;
import starbuzz.coffee.decorators.Mocha;
import starbuzz.coffee.decorators.Soy;
import starbuzz.coffee.decorators.Whip;

public class StarbuzzCoffee {

    public static void main(String srgs[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
