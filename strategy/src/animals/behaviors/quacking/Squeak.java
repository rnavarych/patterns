package animals.behaviors.quacking;

import animals.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }

}
