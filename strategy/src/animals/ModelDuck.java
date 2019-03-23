package animals;

import animals.behaviors.flying.FlyNoWay;
import animals.behaviors.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
