package puzzle.heroes;

import puzzle.Character;
import puzzle.behavior.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
