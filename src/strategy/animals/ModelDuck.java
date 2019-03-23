package strategy.animals;

import strategy.animals.behaviors.flying.FlyNoWay;
import strategy.animals.behaviors.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
