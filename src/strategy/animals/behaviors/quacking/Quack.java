package strategy.animals.behaviors.quacking;

import strategy.animals.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
