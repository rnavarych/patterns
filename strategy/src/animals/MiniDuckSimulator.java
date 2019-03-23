package animals;

import animals.behaviors.flying.FlyRocketPowered;
import animals.ducks.MallarDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-------------------------------------------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }

}
