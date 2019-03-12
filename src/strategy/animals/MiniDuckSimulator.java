package strategy.animals;

import strategy.animals.behaviors.flying.FlyRocketPowered;
import strategy.animals.ducks.MallarDuck;

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
