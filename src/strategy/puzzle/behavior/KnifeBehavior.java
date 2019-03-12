package strategy.puzzle.behavior;

import strategy.puzzle.interfaces.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Удар ножом");
    }
}