package strategy.animals.behaviors.quacking;

import strategy.animals.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
