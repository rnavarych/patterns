package strategy.animals.behaviors.flying;

import strategy.animals.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
