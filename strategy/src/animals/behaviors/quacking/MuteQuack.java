package animals.behaviors.quacking;

import animals.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
