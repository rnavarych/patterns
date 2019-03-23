package puzzle.heroes;

import puzzle.Character;
import puzzle.behavior.AxeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
