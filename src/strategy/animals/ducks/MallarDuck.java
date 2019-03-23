package strategy.animals.ducks;

import strategy.animals.Duck;
import strategy.animals.behaviors.flying.FlyWithWings;
import strategy.animals.behaviors.quacking.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Real Mallard duck!");
    }

}
