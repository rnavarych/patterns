package strategy.animals.behaviors.quacking;

import strategy.animals.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

}
