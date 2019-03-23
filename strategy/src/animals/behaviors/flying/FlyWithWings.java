package animals.behaviors.flying;

import animals.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
