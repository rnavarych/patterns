package animals.behaviors.quacking;

import animals.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
