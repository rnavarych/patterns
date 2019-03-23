package animals.ducks;


import animals.Duck;
import animals.behaviors.flying.FlyWithWings;
import animals.behaviors.quacking.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Real Mallard duck!");
    }

}
